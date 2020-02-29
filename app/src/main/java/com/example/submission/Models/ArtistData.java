package com.example.submission.Models;

import com.example.submission.Models.Artist;

import java.util.ArrayList;

public class ArtistData {
    public static String[][] data = new String[][]{
            {"1","Ariana Grande","June 26, 1993","Female","Singer",
                    "Ariana Grande-Butera (born June 26, 1993) is an American singer, songwriter, and actress. A multi-platinum, Grammy Award-winning recording artist, she is known for her wide vocal range, which critics have often compared to that of Mariah Carey. Born in Boca Raton, Florida, Grande began her career in 2008 in the Broadway musical, 13. She rose to prominence for her role as Cat Valentine in the Nickelodeon television series, Victorious (2010–2013) and in its spin-off, Sam & Cat (2013–2014). As she grew interested in pursuing a music career, Grande recorded songs for the soundtrack of Victorious and signed with Republic Records in 2011 after the label's executives discovered videos of her covering songs that she uploaded onto YouTube. She released her debut album, Yours Truly, in 2013.",
                    "https://firebasestorage.googleapis.com/v0/b/testing01-52b82.appspot.com/o/arianagrande.jpg?alt=media&token=d3b1ba46-591f-452b-9651-89de62a968bb",
                    "Ariana_Grande",
                    "arianagrande"},
            {"2","Meghan Trainor","December 22, 1993","Female","Singer",
                    "Meghan Elizabeth Trainor (born December 22, 1993) is an American singer-songwriter. Interested in music from a young age, she wrote, recorded, and produced three independently released albums between 2009 and 2011.\n" +
                            "\n" +
                            "Since signing with Epic Records in 2014, Trainor has earned three top-five singles on the US Billboard Hot 100; “All About That Bass” topped the chart for eight consecutive weeks, “Lips Are Movin” consecutively became her second top-five single, and “No” became her fastest to reach the top five.",
                    "https://firebasestorage.googleapis.com/v0/b/testing01-52b82.appspot.com/o/meghantrainor.jpg?alt=media&token=1cc54511-eb10-4b9d-9b83-fa2b2f337807",
                    "Meghan_Trainor",
                    "meghan_trainor"},
            {"3","Sabrina Carpenter","May 11, 1999","Female","Singer",
                    "Sabrina Annlynn Carpenter (born May 11, 1999) is an American singer and actress. She had a recurring role as the young version of Chloe Goodwin in The Goodwin Games and starred as Maya Hart in the Disney Channel series Girl Meets World. She starred as Jenny Parker in 2016 Disney Channel Original Movie Adventures in Babysitting. She is signed to Hollywood Records. Her debut EP Can't Blame a Girl for Trying was released in 2014, and she has since released three full-length albums: Eyes Wide Open (2015), Evolution (2016), and Singular: Act I (2018). Her fourth studio album, Singular: Act II, was released on July 19, 2019.",
                    "https://firebasestorage.googleapis.com/v0/b/testing01-52b82.appspot.com/o/sabrinacarpenter.jpg?alt=media&token=89415cd1-8b95-45df-93dd-67b0ae151965",
                    "Sabrina_Carpenter",
                    "sabrinacarpenter"},
            {"4","Camila Cabello","March 3, 1997","Female","Singer",
                    "Karla Camila Cabello Estrabao (born March 3, 1997) is a Cuban-American singer and songwriter. She rose to prominence as a member of the girl group Fifth Harmony, formed on The X Factor (U.S.) in 2012, signing a joint record deal with Syco Music and Epic Records.\n" +
                            "\n" +
                            "While a part of Fifth Harmony, Cabello began to establish herself as a solo artist with the release of the collaborations \"I Know What You Did Last Summer\" with Shawn Mendes, and \"Bad Things\" with Machine Gun Kelly, the latter reaching number four on the Billboard Hot 100 U.S chart. After leaving the group in December 2016, Cabello released several other collaborations, including \"Hey Ma\" with Pitbull and J Balvin for The Fate of the Furious soundtrack.",
                    "https://firebasestorage.googleapis.com/v0/b/testing01-52b82.appspot.com/o/camilacabello.jpg?alt=media&token=1c0aa609-1704-4f94-9557-b6419ac2280e",
                    "Camila_Cabello",
                    "camila_cabello"},
            {"5","Zara Larsson","December 16, 1997","Female","Singer",
                    "Zara Maria Larsson (born December 16, 1997) is a Swedish singer and songwriter. At the age of 10, she achieved national fame in Sweden for winning the 2008 season of the talent show Talang, the Swedish version of British TV's Got Talent. Four years later, in 2012, Larsson signed with the record label TEN Music Group and released her debut EP album Introducing in January 2013. The single \"Uncover\" topped the music charts in Scandinavia: Sweden, Denmark, and Norway. In February 2013, \"Uncover\" was certified Platinum by Universal Music Sweden. In July 2013, her EP Introducing was certified 3× Platinum in the country. Larsson signed a three-year contract with Epic Records in the United States in April 2013. In 2016, she performed at the opening and closing ceremonies for UEFA Euro in France.",
                    "https://firebasestorage.googleapis.com/v0/b/testing01-52b82.appspot.com/o/zaralarssson.jpg?alt=media&token=cb964380-b5b7-4f76-85ee-415beb39ea29",
                    "Zara_Larsson",
                    "zaralarsson"},
            {"6","Karen Gillian","November 28, 1987","Female","Actress",
                    "Karen Sheila Gillan (born November 28, 1987) is a Scottish actress and filmmaker. She played Amy Pond, companion to the Eleventh Doctor, in the BBC One series Doctor Who (2010–2013). She received international recognition for playing Nebula in the Marvel Cinematic Universe films Guardians of the Galaxy (2014), Guardians of the Galaxy Vol. 2 (2017), Avengers: Infinity War (2018) and Avengers: Endgame (2019) as well as for her starring role in Jumanji: Welcome to the Jungle (2017).\n" +
                            "\n" +
                            "On stage, Gillan appeared in John Osborne's play Inadmissible Evidence in 2011. Her first feature film as a writer and director, titled The Party's Just Beginning, was released in 2018.",
                    "https://firebasestorage.googleapis.com/v0/b/testing01-52b82.appspot.com/o/karengillian.jpg?alt=media&token=23538116-2dfa-499b-818d-1ca6a86e596a",
                    "Karen_Gillan",
                    "karengillanofficial"},
            {"7","Dua Lipa","August 22, 1995","Female","Singer",
                    "Dua Lipa (born August 22, 1995) is an English singer and songwriter. After working as a model she signed with Warner Music Group in 2015 and soon released her first song \"New Love\".\n" +
                            "\n" +
                            "Her self-titled debut studio album was released on 2 June 2017. The album spawned seven singles, including two UK top-10 singles \"Be the One\" and \"IDGAF\" and the UK number-one single \"New Rules\", which also reached number six in the United States. The single \"One Kiss\" with Calvin Harris reached number one in the UK in 2018. Lipa has been nominated for ten Brit Awards and two Grammy Awards, winning three and two respectively.",
                    "https://firebasestorage.googleapis.com/v0/b/testing01-52b82.appspot.com/o/dualipa.jpg?alt=media&token=45643b6b-d138-48b6-95d0-053261785aa0",
                    "Dua_Lipa",
                    "dualipa"},
            {"8","Alexandra Daddario","March 16, 1986","Female","Actress",
                    "Alexandra Anna Daddario (born March 16, 1986) is an American actress. She is known for playing Annabeth Chase in the Percy Jackson film series, Blake Gaines in San Andreas, Summer Quinn in the 2017 Baywatch film and Avery Martin in When We First Met. She has also starred in the films Texas Chainsaw 3D and Hall Pass and has guest starred in television series such as White Collar, It's Always Sunny in Philadelphia, True Detective, New Girl and American Horror Story: Hotel.\n" +
                            "\n" +
                            "Daddario made her television debut at the age of 16, when she played victimized teen Laurie Lewis in the ABC daytime soap opera All My Children. ",
                    "https://firebasestorage.googleapis.com/v0/b/testing01-52b82.appspot.com/o/alexandradd.jpg?alt=media&token=efd29f82-2923-4ddf-aaa3-a79c571b8967",
                    "Alexandra_Daddario",
                    "alexandradaddario"},
            {"9","Jade Thirlwall","December 26, 1992","Female","Singer",
                    "Jade Amelia Thirlwall was born on 26 December 1992 (age 26), and raised in the Laygate area of South Shields, Tyne and Wear. She has one-quarter Egyptian ancestry and one-quarter Yemeni ancestry. She also auditioned for The X Factor in 2008 and 2010, but got eliminated at the Bootcamp stage. She attended performing arts college South Tyneside, where she studied a range of courses. She revealed in the group's book, Our World, that she struggled with anorexia nervosa after experiencing bullying at school, and the death of her grandfather. Thirlwall is a supporter of the LGBT community, and she considers RuPaul her idol. In April 2019, Thirlwall, alongside Pinnock, signed to TwentySeven as published songwriters.",
                    "https://firebasestorage.googleapis.com/v0/b/testing01-52b82.appspot.com/o/jadethirlwall.jpg?alt=media&token=6e8b13e7-8a8e-424f-a7cf-55a2825dc90a",
                    "Little_Mix#Jade_Thirlwall",
                    "jadethirlwall"},
            {"10","Olivia Munn","July 3, 1980","Female","Actress",
                    "Lisa Olivia Munn (born July 3, 1980) is an American actress and activist. She began her professional career in television journalism before becoming an actress. In 2006, Munn starred as Mily Acuna on the series Beyond the Break. She co-hosted Attack of the Show! from 2006 to 2010 and was a correspondent on The Daily Show from 2010 to 2011.\n" +
                            "\n" +
                            "Munn has also had supporting roles in various films and television series since 2004. She played the character Sloan Sabbith on the television series The Newsroom from 2012 to 2014, and has appeared in the films Magic Mike (2012), the horror film Deliver Us from Evil (2014), the comedy Mortdecai (2015), and X-Men: Apocalypse (2016) as Psylocke. In 2017, she provided the voice of Koko in The Lego Ninjago Movie, and also had a lead role on the History Channel series Six (2017).",
                    "https://firebasestorage.googleapis.com/v0/b/testing01-52b82.appspot.com/o/oliviamunn.jpg?alt=media&token=0dc7968d-47b0-4e58-9884-83d4fd5d805b",
                    "Olivia_Munn",
                    "oliviamunn"}
//            {"2","Name","Born","Gender","Occupation",
//                    "Desc",
//                    "photolink",
//                    "wikiname",
//                    "igname"},
    };
    public static ArrayList<Artist> getListData() {
        ArrayList<Artist> list = new ArrayList<>();
        for (String[] itemData : data){
            Artist artist = new Artist(itemData[0], itemData[1], itemData[2], itemData[3], itemData[4], itemData[5], itemData[6],itemData[7], itemData[8]);
            list.add(artist);
        }
        return list;
    }
}
