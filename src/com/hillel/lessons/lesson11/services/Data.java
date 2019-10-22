package com.hillel.lessons.lesson11.services;

import com.hillel.lessons.lesson11.Customer;
import com.hillel.lessons.lesson11.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Static data class consists data for create random data.
 */
public class Data {
    /**
     * List of random generated objects of products
     */
    public static List<Product> products;
    /**
     * List of random generated objects of customers
     */
    public static List<Customer> customers;
    /**
     * List of random generated strings that consist name of Ukrainian cities
     */
    public static List<String> cities;

    /*
      Block static initialization
     */
    static {
        products = new ArrayList<>();
        products.add(Product.of("INDOMETHACIN", new BigDecimal("2.64")));
        products.add(Product.of("Stool Softener", new BigDecimal("1.74")));
        products.add(Product.of("Olanzapine", new BigDecimal("14.11")));
        products.add(Product.of("Cyclobenzaprine Hydrochloride", new BigDecimal("11.35")));
        products.add(Product.of("ORIGINAL POWER REFIRMING AMPOULE", new BigDecimal("9.62")));
        products.add(Product.of("Famciclovir", new BigDecimal("0.33")));
        products.add(Product.of("Ramipril", new BigDecimal("12.43")));
        products.add(Product.of("anti itch", new BigDecimal("1.85")));
        products.add(Product.of("Calendula", new BigDecimal("9.01")));
        products.add(Product.of("Amlodipine besylate and Atorvastatin calcium", new BigDecimal("14.57")));
        products.add(Product.of("ACD-A", new BigDecimal("1.16")));
        products.add(Product.of("Cyclobenzaprine Hydrochloride", new BigDecimal("1.88")));
        products.add(Product.of("TIMENTIN", new BigDecimal("5.31")));
        products.add(Product.of("SHISEIDO SUN PROTECTION FOUNDATION", new BigDecimal("10.22")));
        products.add(Product.of("ADVAIR", new BigDecimal("4.49")));
        products.add(Product.of("Famotidine", new BigDecimal("10.43")));
        products.add(Product.of("Pollens - Grasses, Grass Mix 8", new BigDecimal("5.64")));
        products.add(Product.of("Olanzapine", new BigDecimal("5.45")));
        products.add(Product.of("Face Moisturiser", new BigDecimal("9.16")));
        products.add(Product.of("Ropinirole Hydrochloride", new BigDecimal("6.74")));
        products.add(Product.of("good sense nicotine", new BigDecimal("11.52")));
        products.add(Product.of("Aveeno Active Naturals Positively Radiant Tinted Moisturizer", new BigDecimal("5.55")));
        products.add(Product.of("Motion Sickness Relief", new BigDecimal("10.93")));
        products.add(Product.of("levalbuterol hydrochloride", new BigDecimal("3.38")));
        products.add(Product.of("Family Wellness Antifungal", new BigDecimal("5.82")));
        products.add(Product.of("Foamahol", new BigDecimal("6.35")));
        products.add(Product.of("good sense nicotine", new BigDecimal("4.31")));
        products.add(Product.of("RANITIDINE", new BigDecimal("11.95")));
        products.add(Product.of("Original Formula Motion Sickness Relief", new BigDecimal("12.88")));
        products.add(Product.of("Lipitor", new BigDecimal("0.59")));
        products.add(Product.of("SPEEDGEL RX", new BigDecimal("11.93")));
        products.add(Product.of("First Aid Antibiotic", new BigDecimal("12.37")));
        products.add(Product.of("Nitrofurantoin Monohydrate/ Macrocrystalline", new BigDecimal("5.77")));
        products.add(Product.of("Treatment Set TS351313", new BigDecimal("3.08")));
        products.add(Product.of("Belli Pure Radiance Facial Sunscreen Tinted SPF 25", new BigDecimal("9.82")));
        products.add(Product.of("Propranolol Hydrochloride", new BigDecimal("7.84")));
        products.add(Product.of("Digoxin", new BigDecimal("3.05")));
        products.add(Product.of("Homeopathic Burn", new BigDecimal("7.03")));
        products.add(Product.of("Stavudine", new BigDecimal("10.53")));
        products.add(Product.of("Australian Gold", new BigDecimal("14.4")));
        products.add(Product.of("Dilaudid", new BigDecimal("0.83")));
        products.add(Product.of("Fleet", new BigDecimal("5.5")));
        products.add(Product.of("Cattle Hair", new BigDecimal("8.99")));
        products.add(Product.of("PEGINTRON", new BigDecimal("14.75")));
        products.add(Product.of("ARRID Extra Dry", new BigDecimal("4.62")));
        products.add(Product.of("Amlodipine Besylate and Benazepril Hydrochloride", new BigDecimal("13.53")));
        products.add(Product.of("Diflorasone Diacetate", new BigDecimal("7.66")));
        products.add(Product.of("Bromday", new BigDecimal("6.53")));
        products.add(Product.of("FIRST AID RESEARCH ZINC OXYDE PLUS", new BigDecimal("12.31")));
        products.add(Product.of("Natural White", new BigDecimal("14.44")));

        customers = new ArrayList<>();
        customers.add(new Customer("Alasteir Mistry", "amistry0@blogs.com"));
        customers.add(new Customer("Freddi Bellelli", "fbellelli1@reference.com"));
        customers.add(new Customer("Jamey Lesek", "jlesek2@dailymail.co.uk"));
        customers.add(new Customer("Franzen Busswell", "fbusswell3@dailymail.co.uk"));
        customers.add(new Customer("Hyacinthia Sherrett", "hsherrett4@ovh.net"));
        customers.add(new Customer("Bette Kimmitt", "bkimmitt5@networkadverti.org"));
        customers.add(new Customer("Kyrstin Ribey", "kribey6@miitbeian.gov.cn"));
        customers.add(new Customer("Shurlocke Costar", "scostar7@i2i.jp"));
        customers.add(new Customer("Agneta Pogosian", "apogosian8@businesswire.com"));
        customers.add(new Customer("Anthiathia Rawlison", "arawlison9@home.pl"));
        customers.add(new Customer("Ardelis Collyer", "acollyera@chronoengine.com"));
        customers.add(new Customer("Charles Polycote", "cpolycoteb@yahoo.co.jp"));
        customers.add(new Customer("Anthiathia O'Hartnedy", "aohartnedyc@huffingt.com"));
        customers.add(new Customer("Corenda Murrigan", "cmurrigand@posterous.com"));
        customers.add(new Customer("Prentiss Skamell", "pskamelle@twitter.com"));
        customers.add(new Customer("Wes Quene", "wquenef@japanpost.jp"));
        customers.add(new Customer("Wendel Coade", "wcoadeg@clickbank.net"));
        customers.add(new Customer("Sumner Cornell", "scornellh@ibm.com"));
        customers.add(new Customer("Lara Durnford", "ldurnfordi@wufoo.com"));
        customers.add(new Customer("Udall Beadel", "ubeadelj@phpbb.com"));
        customers.add(new Customer("Joseito Costigan", "jcostigank@sitemeter.com"));
        customers.add(new Customer("Jennifer Yekel", "jyekell@goo.ne.jp"));
        customers.add(new Customer("Gareth Bridson", "gbridsonm@kickstarter.com"));
        customers.add(new Customer("Gris Finan", "gfinann@ifeng.com"));
        customers.add(new Customer("Loria O' Mulderrig", "loo@cnn.com"));
        customers.add(new Customer("Rosa Hould", "rhouldp@list-manage.com"));
        customers.add(new Customer("Rana Scotchmore", "rscotchmoreq@theguardian.com"));
        customers.add(new Customer("Michaeline Snewin", "msnewinr@wordpress.org"));
        customers.add(new Customer("Vilma Rycroft", "vrycrofts@latimes.com"));
        customers.add(new Customer("Mic Whye", "mwhyet@addtoany.com"));
        customers.add(new Customer("Perri Toderi", "ptoderiu@usa.gov"));
        customers.add(new Customer("Malinde Sleeman", "msleemanv@taobao.com"));
        customers.add(new Customer("Tye Kinforth", "tkinforthw@macromedia.com"));
        customers.add(new Customer("Hayden Helks", "hhelksx@cbsnews.com"));
        customers.add(new Customer("Hattie Clitsome", "hclitsomey@ftc.gov"));
        customers.add(new Customer("Oralla Stadden", "ostaddenz@unblog.fr"));
        customers.add(new Customer("Tony Djekovic", "tdjekovic10@jiathis.com"));
        customers.add(new Customer("Gusti Franzotto", "gfranzotto11@clickbank.net"));
        customers.add(new Customer("Lorettalorna Pheasey", "lpheasey12@senate.gov"));
        customers.add(new Customer("Layla Joskowicz", "ljoskowicz13@cafepress.com"));
        customers.add(new Customer("Electra Roantree", "eroantree14@tripadvisor.com"));
        customers.add(new Customer("Julian Keyho", "jkeyho15@va.gov"));
        customers.add(new Customer("Birgit Cockerill", "bcockerill16@newyorker.com"));
        customers.add(new Customer("Guinevere Oattes", "goattes17@devhub.com"));
        customers.add(new Customer("Jock Gifford", "jgifford18@ftc.gov"));
        customers.add(new Customer("Alberik Bleckly", "ableckly19@photobucket.com"));
        customers.add(new Customer("Orel Edmonston", "oedmonston1a@symantec.com"));
        customers.add(new Customer("Cynthea Bleier", "cbleier1b@liveinternet.ru"));
        customers.add(new Customer("Brandie Dickerline", "bdickerline1c@npr.org"));
        customers.add(new Customer("El Seymer", "eseymer1d@wikia.com"));

        cities = new ArrayList<>();
        cities.add("Zhvanets");
        cities.add("Boyarka");
        cities.add("Kushnytsya");
        cities.add("Horodok");
        cities.add("Lanchyn");
        cities.add("Makiv");
        cities.add("Nemyriv");
        cities.add("Slatyne");
        cities.add("Oster");
        cities.add("Kozel’shchyna");
        cities.add("Zdovbytsya");
        cities.add("Tyachiv");
        cities.add("Bakhmach");
        cities.add("Buchach");
        cities.add("Bolekhiv");
        cities.add("Rubizhne");
        cities.add("Korosten’");
        cities.add("Karapyshi");
        cities.add("Velykyi Bereznyi");
        cities.add("Lanchyn");
        cities.add("Lymanske");
        cities.add("Simeykyne");
        cities.add("Velyki Kopany");
        cities.add("Verblyany");
        cities.add("Yasinya");
        cities.add("Yakymivka");
        cities.add("Rechka");
        cities.add("Storozhynets’");
        cities.add("Shostka");
        cities.add("Drohobych");
        cities.add("Staryy Saltiv");
        cities.add("Troyits’ke");
        cities.add("Balky");
        cities.add("Bilohirs’k");
        cities.add("Pereval'noe");
        cities.add("Horodyshche");
        cities.add("Oster");
        cities.add("Pryazovs’ke");
        cities.add("Verkhniy Yasenov");
        cities.add("Kalyny");
        cities.add("Verkhnya Rozhanka");
        cities.add("Bryukhovychi");
        cities.add("Chervone");
        cities.add("Kuty");
        cities.add("Bystrytsya");
        cities.add("Zgurovka");
        cities.add("Vashkivtsi");
        cities.add("Zaozerne");
        cities.add("Yasynuvata");
        cities.add("Stetseva");
        cities.add("Stepanivka");
        cities.add("Osypenko");
        cities.add("Kolodenka");
        cities.add("Velykyi Bereznyi");
        cities.add("Boromlya");
        cities.add("Barvinkove");
        cities.add("Krasyliv");
        cities.add("Mukacheve");
        cities.add("Rechka");
        cities.add("Berezne");
        cities.add("Uhryniv");
        cities.add("Inkerman");
        cities.add("Chornoliztsi");
        cities.add("Izyaslav");
        cities.add("Kopychyntsi");
        cities.add("Lazurne");
        cities.add("Krasnoarmiys’k");
        cities.add("Smyga");
        cities.add("Verbivka");
        cities.add("Lazeshchyna");
        cities.add("Kostyantynivka");
        cities.add("Ovidiopol’");
        cities.add("Selydove");
        cities.add("Vuhlehirs’k");
        cities.add("Tysmenytsya");
        cities.add("Dashev");
        cities.add("Stizhkivs’ke");
        cities.add("Zaporizhzhya");
        cities.add("Velyki Kopany");
        cities.add("Klenovyy");
        cities.add("Sivers’k");
        cities.add("Budy");
        cities.add("Vinnytsya");
        cities.add("Mikulintsy");
        cities.add("Stepanivka");
        cities.add("Dudchany");
        cities.add("Yenakiyeve");
        cities.add("Ozerne");
        cities.add("Kherson");
        cities.add("Tynne");
        cities.add("Derhachi");
        cities.add("Koryukivka");
        cities.add("Komarno");
        cities.add("Koloniya Zastav’ye");
        cities.add("Alchevs’k");
        cities.add("Urzuf");
        cities.add("Strabychovo");
        cities.add("Zakupne");
        cities.add("Tlumach");
    }
}
