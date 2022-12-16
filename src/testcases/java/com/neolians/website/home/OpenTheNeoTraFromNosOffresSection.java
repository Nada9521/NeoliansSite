package com.neolians.website.home;

import com.neolians.common.utils.report.Report;
import com.neolians.website.functions.general.Errors;
import com.neolians.website.functions.general.Footer;
import com.neolians.website.functions.general.Menu;
import com.neolians.website.functions.pages.Home;
import com.neolians.website.functions.pages.NeoMobile;
import com.neolians.website.functions.pages.NeoServices;
import com.neolians.website.functions.pages.NeoTra;
import com.neolians.website.repository.general.PageMenu;
import com.neolians.website.repository.pages.PageNeoServices;
import com.neolians.website.repository.pages.PageNeoTra;
import com.neolians.website.repository.pages.PageNosProjets;
import com.neolians.website.utils.report.NeoliansTestcase;
import io.github.artsok.RepeatedIfExceptionsTest;

public class OpenTheNeoTraFromNosOffresSection extends NeoliansTestcase {
    @RepeatedIfExceptionsTest(repeats = 1, suspend = 5000L, name = "Check Neo TRA From Nos offres Page")
    void checkNeoTRAFromNosOffresPage() {

        Report.newStep(1, "Open Home Page");
        Home.openPage();

        Report.newStep(2, "Verify Neo TRA Page From Nos offres");
        Home.openNeoTraPageFromNosoffres();

        Report.newStep(3, "Verify content Neo TRA page");
        NeoTra.openPageNeotra();

        Report.newStep(4, "Verifie Menu");
        Menu.verifieMenu();

        Report.newStep(5, "Check No error");
        Errors.checkNoErrors();

        Report.newStep(6, "Verifie Footer");
        Footer.verifieFooter();



    }
}
