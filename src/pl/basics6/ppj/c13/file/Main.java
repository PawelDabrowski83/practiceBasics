package pl.basics6.ppj.c13.file;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        File[] files = new File[10];
        files[0] = createFileOfRandomType(
                "Never Run Away",
                1,
                "Never Run Away – dziewiąty album studyjny Don Carlosa, jamajskiego wykonawcy muzyki roots reggae.\n" +
                        "\n" +
                        "Płyta została wydana w roku 1984 przez niewielką wytwórnię Kingdom Records. Nagrania zarejestrowane zostały w studiach Harry J oraz Channel One w Kingston. Ich produkcją zajęli się Roy Cousins i Terry King. Don Carlosowi akompaniowali muzycy sesyjni z zespołu The Roots Radics Band. W roku 2006 nakładem Tamoki Wambesi Records ukazała się reedycja albumu na CD, zawierająca także kilka dodatkowych utworów."
        );
        files[1] = createFileOfRandomType(
                "Tamsyn Lewis",
                15,
                "Tamsyn Lewis-Manou (ur. 20 lipca 1978 w Melbourne) – australijska lekkoatletka, specjalistka średnich dystansów, wicemistrzyni świata z Maebashi w sztafecie 4 x 400 metrów, halowa mistrzyni świata z Walencji w biegu na 800 m, olimpijka.\n" +
                        "\n" +
                        "Wielokrotna mistrzyni i rekordzistka kraju. Córka Grega Lewisa – australijskiego sprintera, olimpijczyka i rekordzisty kraju."
        );
        files[2] = createFileOfRandomType(
                "Erich Farthofer",
                8,
                "Erich Farthofer (ur. 27 kwietnia 1951 w Wiehalm[1]) – austriacki polityk, kolejarz i samorządowiec, członek Rady Federalnej, deputowany do Parlamentu Europejskiego IV kadencji.\n" +
                        "\n" +
                        "Życiorys\n" +
                        "Z zawodu kolejarz, w 1972 uzyskał uprawnienia maszynisty. Pracował zawodowo w austriackich kolejach państwowych Österreichische Bundesbahnen. Zaangażował się w działalność polityczną w ramach Socjaldemokratycznej Partii Austrii. W latach 1980–1983 był członkiem samorządu miejskiego w Schwarzenau. W 1979 został przewodniczącym SPÖ w Schwarzenau, a w 1983 w powiecie Zwettl, wchodząc wówczas również w skład regionalnego zarządu socjaldemokratów w Dolnej Austrii. Został również członkiem regionalnych władz organizacji charytatywnej Volkshilfe[2].\n" +
                        "\n" +
                        "Od 1986 do 1999 zasiadał w austriackim Bundesracie[2]. W latach 1995–1996 jednocześnie sprawował mandat eurodeputowanego w ramach delegacji krajowej[1]. Od 1999 do 2003 był członkiem landtagu Dolnej Austrii[2].\n" +
                        "\n" +
                        "Odznaczony Wielką Srebrną Odznaką Honorową za Zasługi dla Republiki Austrii (1994)[3]."
        );
        files[3] = createFileOfRandomType(
                "Grabovci (Serbia)",
                1,
                "Grabovci (cyr. Грабовци) – wieś w Serbii, w Wojwodinie, w okręgu sremskim, w gminie Ruma. W 2011 roku liczyła 1189 mieszkańców[1]."
        );
        files[4] = createFileOfRandomType(
                "Tułowice Sochaczewskie",
                5,
                "Tułowice Sochaczewskie – wąskotorowa stacja kolejowa w Tułowicach, w gminie Brochów, w powiecie sochaczewskim, w województwie mazowieckim, w Polsce. Została otwarta w dniu 18 września 1922 roku razem z linią z Sochaczewa do Tułowic. Linia do Piasków Królewskich została otwarta w 1923 roku[1]."
        );
        files[5] = createFileOfRandomType(
                "Föhr",
                2,
                "Föhr (fryz. Feer, duń. Før) – jedna z Wysp Północnofryzyjskich przy niemieckim wybrzeżu Morza Północnego.\n" +
                        "\n" +
                        "Administracyjnie należy do powiatu Nordfriesland w kraju związkowym Szlezwik-Holsztyn. Wyspa ma powierzchnię 82,82 km², a zamieszkuje ją około 8,5 tys. mieszkańców. Jest to największa z niemieckich wysp nieosiągalnych samochodem ani koleją.\n" +
                        "\n" +
                        "Największym miastem wyspy jest Wyk auf Föhr położony na jej wschodnim wybrzeżu. Ponadto na wyspie znajduje się 16 niewielkich miejscowości, trzy z nich z zabytkowymi kościołami z XII i XIII w. Miejscowa ludność używa, oprócz języka niemieckiego, także lokalnej odmiany fryzyjskiego, zwanej Föhring lub Fering.\n" +
                        "\n" +
                        "Na wyspę można się dostać promem samochodowym, kursującym między położonym na stałym lądzie portem Dagebüll a miasteczkiem Wyk auf Föhr[1].\n" +
                        "\n" +
                        "Popularną atrakcją wyspy jest „Wellenbad”, basen kąpielowy ze sztucznymi falami w miasteczku Wyk, odbudowany po pożarze[potrzebny przypis]."
        );
        files[6] = createFileOfRandomType(
                "Jean Wicki",
                1,
                "Jean Wicki (ur. 18 czerwca 1933[1]) – szwajcarski bobsleista. Trzykrotny medalista olimpijski.\n" +
                        "\n" +
                        "Dwa razy startował na igrzyskach olimpijskich (IO 68, IO 72) i na obu olimpiadach zdobywał medale. W 1968 w czwórkach wywalczył brązowy medal. Na początku lat 70. zaproponował współpracę lekkoatlecie Edy'emu Hubacherowi. Podczas IO 72 w dwójkach zajęli trzecie miejsce, w czwórkach bob prowadzony przez Wickiego nie miał sobie równych."
        );
        files[7] = createFileOfRandomType(
                "Néstor Cardoso",
                2,
                "Néstor Lucas Cardoso (ur. 17 listopada 1935 w Rosario) – argentyński piłkarz grający podczas kariery na pozycji obrońcy.\n" +
                        "\n" +
                        "Kariera klubowa\n" +
                        "Néstor Cardoso rozpoczął karierę w klubie Rosario Central w 1955. W Rosario grał do 1964, kiedy to przeszedł do drugoligowego Colónu Santa Fe, w którym w 1966 zakończył piłkarską karierę. Ogółem w latach 1955-1964 rozegrał w lidze argentyńskiej 240 meczów, w których strzelił 5 bramek.\n" +
                        "\n" +
                        "Kariera reprezentacyjna\n" +
                        "W reprezentacji Argentyny Cardoso zadebiutował 12 lipca 1960 w przegranym 1-5 meczu z Brazylią w Copa del Atlántico 1960. W 1963 uczestniczył w Mistrzostwach Ameryki Południowej. Na turnieju w Boliwii Argentyna zajęła trzecie miejsce. Na turnieju wystąpił w czterech meczach z Kolumbią, Brazylią, Boliwią i Paragwajem, który był jego ostatnim występem w reprezentacji. Ogółem w barwach albicelestes wystąpił w 7 meczach."
        );
        files[8] = createFileOfRandomType(
                "Wymieranie kredowe",
                20,
                "Wymieranie kredowe – masowe wymieranie sprzed 66 milionów lat, podczas którego wyginęło około 3/4 gatunków roślin i zwierząt żyjących na Ziemi, w tym nieptasie dinozaury[1][2][3]. Wyznacza ono koniec okresu kredowego i ery mezozoicznej, a początek kenozoiku, ery trwającej obecnie.\n" +
                        "\n" +
                        "W zapisie geologicznym zdarzeniu temu odpowiada cienka warstwa osadów, granica K-T, spotykana na całym świecie w skałach morskich i lądowych. Zawiera ona dużą ilość irydu, metalu rzadkiego w skorupie ziemskiej, obficie występującego zaś w planetoidach.\n" +
                        "\n" +
                        "Ogólnie przyjmuje się, że wymieranie to spowodowane zostało przez uderzenie masywnej planetoidy, co wywołało katastrofalne efekty dla globalnego środowiska, w tym przedłużającą się zimę z uniemożliwieniem przeprowadzania fotosyntezy przez rośliny i plankton[4]. Hipotezę impaktu potwierdziło odkrycie mierzącego 180 km krateru Chicxulub na granicy Zatoki Meksykańskiej i półwyspu Jukatan w późnych latach siedemdziesiątych XX wieku[5]. Zapewniło to rozstrzygający dowód, że granica K-T reprezentuje pozostałości uderzenia planetoidy[6]. Fakt wymierania w tym samym czasie stanowi argument za spowodowaniem go przez uderzenie planetoidy[6]. Jednakże niektórzy naukowcy podtrzymują opinię, że wymarcie to spowodowały bądź spotęgowały inne czynniki, jak erupcje wulkaniczne[7], zmiany klimatyczne czy zmiany poziomu morza.\n" +
                        "\n" +
                        "Na przełomie kredy i trzeciorzędu wyginęła szeroka gama gatunków. Najbardziej znane z nich są nieptasie dinozaury. Wymarło wtedy wiele innych organizmów lądowych, wśród nich niektóre ssaki, pterozaury, ptaki[8], jaszczurki[9], owady[10] i rośliny[11]. W oceanach wymieranie to wyniszczyło wielkie jaszczurki morskie mozazaury, plezjozaury, pewne ryby[12], w tym rekiny, mięczaki (zwłaszcza amonity) i wiele gatunków planktonu. Szacuje się, że wyginęło wtedy 75% lub więcej wszystkich żyjących na Ziemi gatunków[13]. Wyginięcie wielu grup stworzyło szansę dla innych organizmów. W jego wyniku wiele grup przeszło gwałtowną radiację adaptacyjną, nagłe i obfite różnicowanie się w nowe formy i gatunki zajmujące opuszczone nisze ekologiczne. Ssaki szczególnie zróżnicowały się w paleogenie[14]. Powstały nowe formy, jak koniowate, walenie, nietoperze czy naczelne. Ptaki[15], ryby[16] i prawdopodobnie jaszczurki[9] również przeszły radiację."
        );
        files[9] = createFileOfRandomType(
                "Mistrzostwa Świata Juniorów w Łyżwiarstwie Szybkim 2008",
                1,
                "37. Mistrzostwa świata juniorów w łyżwiarstwie szybkim 2008 – zawody sportowe, które odbyły się w dniach 22–24 lutego w chińskim Changchun."
        );

        for (File file : files) {
            file.show();
        }
    }

    public static File createFileOfRandomType(String name, int pages, String text) {
        Random random = new Random();

        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
        if (randomNumber < 15) {
            return new File(name, pages, text);
        } else if (randomNumber < 70) {
            return new TopSecretFile(name, pages, text);
        } else {
            return new SecretFile(name, pages, text);
        }
    }
}
