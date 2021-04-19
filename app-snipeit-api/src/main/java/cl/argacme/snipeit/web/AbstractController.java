package cl.argacme.snipeit.web;

import cl.argacme.snipeit.repository.AssetsRepository;
import cl.argacme.snipeit.repository.CategoriesRepository;
import cl.argacme.snipeit.repository.LicenseSeatsRepository;
import cl.argacme.snipeit.repository.LicensesRepository;
import cl.argacme.snipeit.repository.ModelsRepository;
import cl.argacme.snipeit.repository.UsersRepository;
import cl.argacme.snipeit.service.CheckoutService;
import cl.argacme.snipeit.service.EmailService;

public class AbstractController {
	protected AssetsRepository assetsRepository;
	protected CategoriesRepository categoriesRepository;
	protected LicensesRepository licensesRepository;
	protected LicenseSeatsRepository licenseSeatsRepository;
	protected UsersRepository usersRepository;
	protected ModelsRepository modelsRepository ;
	protected EmailService emailService;
	protected CheckoutService checkoutService;

}
