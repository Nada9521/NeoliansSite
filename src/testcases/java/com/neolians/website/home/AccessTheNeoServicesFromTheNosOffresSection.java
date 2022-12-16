package com.neolians.website.home;

import com.neolians.common.utils.report.Report;
import com.neolians.website.functions.general.Errors;
import com.neolians.website.functions.general.Footer;
import com.neolians.website.functions.general.Menu;
import com.neolians.website.functions.pages.Home;
import com.neolians.website.functions.pages.NeoConseil;
import com.neolians.website.functions.pages.NeoServices;
import io.github.artsok.RepeatedIfExceptionsTest;

public class AccessTheNeoServicesFromTheNosOffresSection {

    @RepeatedIfExceptionsTest(repeats = 1, suspend = 5000L, name = "Check Neo.services Page")
    void checkNeoServicesPage() {

        Report.newStep(1, "Open Home Page");
        Home.openPage();

        Report.newStep(2, "Verify Neo services Page From Nos offres");
        Home.NeoServicesfromNosOffres();

        Report.newStep(3, "Verify content Neo services page");
        NeoServices.openPageNeoServicedepuishome();

        Report.newStep(4, "Verifie Menu");
        Menu.verifieMenu();

        Report.newStep(5, "Check No error");
        Errors.checkNoErrors();

        Report.newStep(6, "Verifie Footer");
        Footer.verifieFooter();
    }
}

