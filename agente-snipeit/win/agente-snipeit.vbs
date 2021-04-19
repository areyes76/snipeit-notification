Dim ObjHttp,Comandos
Set ObjHttp = CreateObject("Microsoft.XmlHttp")
'WScript.Sleep(2000)
Dim hostname , liciancia , macaddress , liciancia_aux , macaddress_aux
Dim strMessage, strScript, strStdErr, strStdOut
Dim oExec,oExec2, oWshShell, intErrorLevel
Set oWshShell = CreateObject("WScript.Shell")
'Obtener los datos de Licencia
strScript = oWshShell.ExpandEnvironmentStrings("wmic product get name")
intErrorLevel = 0
On Error Resume Next
Set oExec = oWshShell.Exec (strScript)
If (Err.Number <> 0) Then
  strMessage = "Error: " & Err.Message
  intErrorLevel = 1
Else
  Do While oExec.Status = 0
    Do While Not oExec.StdOut.AtEndOfStream
      strStdOut = strStdOut & oExec.StdOut.ReadLine & vbCrLf
	  liciancia = liciancia & liciancia_aux & """" & oExec.StdOut.ReadLine & """"
	  liciancia_aux =","
    Loop
    Do While Not oExec.StdErr.AtEndOfStream
      strStdErr = strStdErr & oExec.StdErr.ReadLine & vbCrLf
    Loop
    WScript.Sleep 0
  Loop
  intErrorLevel = oExec.ExitCode
  strMessage = strStdOut & strStdErr & CStr(intErrorLevel)
End If
'WScript.Echo (liciancia)
'Obtener datos de macAdress
Set oShell = WScript.CreateObject("WSCript.shell")
set retun = oShell.exec("getmac  /FO CSV")
macaddressarray = split(retun.stdout.readall, """")
dim i
i=0
 
Do 
	
	if len(macaddressarray(i))=17 then
		'msgbox("si es mac:" & macaddressarray(i)) 
		macaddress = macaddress & macaddress_aux & """" & macaddressarray(i) & """"
	    macaddress_aux =","
	else
		'msgbox("No es:" & macaddressarray(i))
	end if
   i=i+1
Loop until i = 100

'Obtener datos de Hostname
Set oShell = WScript.CreateObject("WSCript.shell")
set retun = oShell.exec("hostname")
hostnamearray = split(retun.stdout.readall, """")
i=0
Do 
	if len(hostnamearray(i))>1 then
		hostname = """" & Replace(hostnamearray(i), vbCrLf, "")  & """"
		'hostname = """" & retun.stdout.readall & """"

	else
		'msgbox("No es:" & macaddressarray(i))
	end if
   i=i+1
Loop until i = 100

Set oShell = CreateObject( "WScript.Shell" )
user = oShell.ExpandEnvironmentStrings("%USERNAME%")

licianciafinal=Replace(Replace(Replace(liciancia, chr(13), ""),vbCrLf,""),chr(10),"")
macaddressfinal=Replace(Replace(Replace(macaddress, chr(13), ""),vbCrLf,""),chr(10),"")
hostnamefinal=Replace(Replace(Replace(hostname, chr(13), ""),vbCrLf,""),chr(10),"")
userfinal=Replace(Replace(Replace(user, chr(13), ""),vbCrLf,""),chr(10),"")
userfinal="""" & user & """"

'msgbox(userfinal)
'msgbox(liciancia)
'msgbox(macaddress)
'msgbox(hostname)

'Comandos="dir"
Comandos="{""machine"":" & hostnamefinal & " ,""idMachine"":0,""os"":""win"",""idUser"":0,""user"": " & userfinal & ",""licenses"":[" & licianciafinal & "], ""macaddress"":[ " & macaddressfinal & "]}"
'msgbox(Comandos)
print.write(Comandos)
ObjHttp.Open "POST", "https://reporte-equipo.argacme.com/api/checkout", False
ObjHttp.setRequestHeader "Content-Type", "application/json"
ObjHttp.setRequestHeader "x-access", ""
ObjHttp.setRequestHeader "Cookie", "__cfduid="
ObjHttp.send Comandos
''msgbox "mensaje enviado...."