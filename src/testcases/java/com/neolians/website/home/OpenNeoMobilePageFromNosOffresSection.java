package com.neolians.website.home;

import com.neolians.common.utils.report.Report;
import com.neolians.website.functions.general.Errors;
import com.neolians.website.functions.general.Footer;
import com.neolians.website.functions.general.Menu;
import com.neolians.website.functions.pages.Home;
import com.neolians.website.functions.pages.NeoMobile;
import com.neolians.website.functions.pages.NosPartenaires;
import com.neolians.website.utils.report.NeoliansTestcase;
import io.github.artsok.RepeatedIfExceptionsTest;

public class OpenNeoMobilePageFromNosOffresSection extends NeoliansTestcase {

    @RepeatedIfExceptionsTest(repeats = 1, suspend = 5000L, name = "checkNeoMobilePage")
    void OpenNeoMobilePageFromNosOffresSection() {

        Report.newStep(1, "Open Home Page");
        Home.openPage();

        Report.newStep(2, "Open NeoMobile Page");
        Home.openPageNeoMobile();

        Report.newStep(3, "Verify Menu");
        Menu.verifieMenu();

        Report.newStep(4, "Verify Footer");
        Footer.verifieFooter();

        Report.newStep(5, "Check No error");
        Errors.checkNoErrors();

        Report.newStep(6, "Check NeoMobile Page");
        NeoMobile.verifiePageNeoMobile();
       

    }
}
