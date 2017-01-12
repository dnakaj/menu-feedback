package com.dnakajima.menu_feedback.crawler;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Dan on 1/9/2017
 * See the file "LICENSE" for the full license governing this code.
 */


// 1. URL = http://phillipsacademy.campusdish.com/Commerce/Catalog/Menus.aspx?LocationId=4236&PeriodId=2057&MenuDate=&Mode=week
// 2. TAG = menu-details-day
public class Crawler {
    public static void main(String[] args) {
        testCrawl();
    }

    public static void testCrawl() {
        // This is an experiment for crawling the menu website
        String url = "http://phillipsacademy.campusdish.com/Commerce/Catalog/Menus.aspx?LocationId=4236&PeriodId=2057&MenuDate=&Mode=week";

        try (final WebClient client = new WebClient()) {
            client.getOptions().setCssEnabled(false);
            client.getOptions().setJavaScriptEnabled(false);


            final HtmlPage page = client.getPage(url);
           // System.out.println(page.asText());
            final HtmlDivision div = page.getHtmlElementById("menu-details-day");
            //System.out.println(div);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

