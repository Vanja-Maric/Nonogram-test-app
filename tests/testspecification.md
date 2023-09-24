# Testspecification

## Test av GridGetter-klassen
### TC1.1 -  Test av metoden getBlackAndWhiteGrid med rätt Imagepath och numberOfColumns och numberOfRows över 10 med hjälp av UI
- Indata:
1. Skapa en instans av GridGetter med rätt imagePath till en bild av sol, i PNG format och number of columns = 15 och number och numberOfROws = 15.
2. Anropa getBlackAndWhiteGrid-metoden på den skapade instansen av GridGetter-klassen.
3. Skapa en UI-tabel (tabell i användargränssnittet) som representerar en nonogram-grid.
4. Lägg in den erhållna instansen av den svartvita griden i den skapade UI-tabellen.
5. Markera celler i den UI tabellen:
  * Celler som är markerade som "black" i 2D ArrayList ska ha svart bakgrundsfärg.
  * Celler som är markerade som "white" i 2D ArrayList ska ha vit bakgrundsfärg.
  
- Förväntat resultat (Utdata):
1. Kontrollera att en nonogram tabell med 15 rader och 15 kolumner är skapad.
2. Jämför nonogram-tabellen med originalbilden och verifiera att den behåller de grundläggande former och konturer som finns i originalbilden, även om den är i en förenklad form på grund av det mindre antalet celler i griden.
3. Verifiera att transparenta delar i originalbilden är representerade som vita celler i nonogram grid.
4. Verifiera att delar av bilden som är inte transparenta (med icke-noll RGB-värde) är representerade som svarta celler i nonogram griden och tabellen.

### TC1.1.2 -  Test av metoden getBlackAndWhiteGrid med rätt Imagepath och numberOfColumns och numberOfRows över 50 med hjälp av UI
- Indata:
1. Skapa en instans av GridGetter med rätt imagePath till en bild av sol, i PNG format och number of columns = 55 och number och numberOfROws = 55.
2. Anropa getBlackAndWhiteGrid-metoden på den skapade instansen av GridGetter-klassen.
3. Skapa en UI-tabel (tabell i användargränssnittet) som representerar en nonogram-grid.
4. Lägg in den erhållna instansen av den svartvita griden i den skapade UI-tabellen.
5. Markera celler i den UI tabellen:
  * Celler som är markerade som "black" i 2D ArrayList ska ha svart bakgrundsfärg.
  * Celler som är markerade som "white" i 2D ArrayList ska ha vit bakgrundsfärg.
  
- Förväntat resultat (Utdata):
1. Kontrollera att en nonogram tabell med 15 rader och 15 kolumner är skapad.
2. Jämför nonogram-tabellen med originalbilden och verifiera att den behåller de grundläggande former och konturer som finns i originalbilden.
3. Verifiera att transparenta delar i originalbilden är representerade som vita celler i nonogram grid.
4. Verifiera att delar av bilden som är inte transparenta (med icke-noll RGB-värde) är representerade som svarta celler i nonogram griden och tabellen.

#### TC1.1.3 -  Test av metoden getBlackAndWhiteGrid med rätt Imagepath och numberOfColumns och numberOfRows över 10 (med olika antal av rader och columner) med hjälp av UI
- Indata:
1. Skapa en instans av GridGetter med rätt imagePath till en bild av sol, i PNG format och number of columns = 19 och number och numberOfRows = 15.
2. Anropa getBlackAndWhiteGrid-metoden på den skapade instansen av GridGetter-klassen.
3. Skapa en UI-tabel (tabell i användargränssnittet) som representerar en nonogram-grid.
4. Lägg in den erhållna instansen av den svartvita griden i den skapade UI-tabellen.
5. Markera celler i den UI tabellen:
  * Celler som är markerade som "black" i 2D ArrayList ska ha svart bakgrundsfärg.
  * Celler som är markerade som "white" i 2D ArrayList ska ha vit bakgrundsfärg.
  
- Förväntat resultat (Utdata):
1. Kontrollera att en nonogram tabell med 15 rader och 15 kolumner är skapad.
2. Jämför nonogram-tabellen med originalbilden och verifiera att den behåller de grundläggande former och konturer som finns i originalbilden, även om den är i en förenklad form på grund av det mindre antalet celler i griden.
3. Verifiera att transparenta delar i originalbilden är representerade som vita celler i nonogram grid.
4. Verifiera att delar av bilden som är inte transparenta (med icke-noll RGB-värde) är representerade som svarta celler i nonogram griden och tabellen.

### TC1.1.4 -  Test av metoden getBlackAndWhiteGrid med rätt Imagepath och numberOfColumns och numberOfRows under 10 med hjälp av UI
- Indata:
1. Skapa en instans av GridGetter med rätt imagePath till en bild av sol, i PNG format och number of columns = 5 och number och numberOfROws = 5.
2. Anropa getBlackAndWhiteGrid-metoden på den skapade instansen av GridGetter-klassen.
3. Skapa en UI-tabel (tabell i användargränssnittet) som representerar en nonogram-grid.
4. Lägg in den erhållna instansen av den svartvita griden i den skapade UI-tabellen.
5. Markera celler i den UI tabellen:
  * Celler som är markerade som "black" i 2D ArrayList ska ha svart bakgrundsfärg.
  * Celler som är markerade som "white" i 2D ArrayList ska ha vit bakgrundsfärg.
  
- Förväntat resultat (Utdata):
1. Kontrollera att en nonogram tabell med 15 rader och 15 kolumner är skapad.
2. Jämför nonogram-tabellen med originalbilden och verifiera att den behåller de grundläggande former och konturer som finns i originalbilden, även om den är i en förenklad form på grund av det mindre antalet celler i griden.
3. Verifiera att transparenta delar i originalbilden är representerade som vita celler i nonogram grid.
4. Verifiera att delar av bilden som är inte transparenta (med icke-noll RGB-värde) är representerade som svarta celler i nonogram griden och tabellen.

### TC1.2 Test av metoden getBlackAndWhiteGrid med felaktigt Imagepath och numberOfColumns och numberOfRows under 10 med hjälp av UI
- Indata:
1. Skapa en instans av GridGetter med felaktigt imagePath (namge bilden sol.png men anropa slo.png) och number of columns = 5 och number och numberOfROws = 5.
2. Anropa getBlackAndWhiteGrid-metoden på den skapade instansen av GridGetter-klassen.
- Förväntat resultat (Utdata):
1. Kontrollera att följande felmeddelande är presenterad
* "Can't read input file"

### TC1.2.2 Test av metoden getBlackAndWhiteGrid med rätt Imagepath, felaktig numberOfColumns och  numberOfRows under 10 med hjälp av UI
- Indata:
1. Skapa en instans av GridGetter med felaktigt imagePath (namge bilden sol.png men anropa slo.png) och number of columns = 0 och number och numberOfROws = 5.
2. Anropa getBlackAndWhiteGrid-metoden på den skapade instansen av GridGetter-klassen.
- Förväntat resultat (Utdata):
1. Kontrollera att följande felmeddelande är presenterad
* "Number of columns in image grid cannot be less than 1."

### TC2.1 -  Test av metoden getRedBlueGreenWhiteGrid med rätt Imagepath och numberOfColumns och numberOfRows över 10 med hjälp av UI
- Indata:
1. Skapa en instans av GridGetter med rätt imagePath till en bild av sol, i PNG format och number of columns = 15 och number och numberOfROws = 15.
2. Anropa getRedBlueGreenWhiteGrid-metoden på den skapade instansen av GridGetter-klassen.
3. Skapa en UI-tabel (tabell i användargränssnittet) som representerar en nonogram-grid.
4. Lägg in den erhållna instansen av den redgreenbluewhite griden i den skapade UI-tabellen.
5. Markera celler i den UI tabellen:
  * Celler som är markerade som "red" i 2D ArrayList ska ha röd bakgrundsfärg.
  * Celler som är markerade som "green" i 2D ArrayList ska ha green bakgrundsfärg.
  * Celler som är markerade som "blue" i 2D ArrayList ska ha blue bakgrundsfärg.
  * Celler som är markerade som "white" i 2D ArrayList ska ha vit bakgrundsfärg.
  
- Förväntat resultat (Utdata):
1. Kontrollera att en nonogram tabell med 15 rader och 15 kolumner är skapad.
2. Jämför nonogram-tabellen med originalbilden och verifiera att den behåller de grundläggande former och konturer som finns i originalbilden, även om den är i en förenklad form på grund av det mindre antalet celler i griden.
3. Verifiera att transparenta delar i originalbilden är representerade som vita celler i nonogram grid.
4. Verifiera att delar av bilden som är inte transparenta (med icke-noll RGB-värde) är representerade som svarta celler i nonogram griden och tabellen.
5. Verifiera att roda delar i bilden är representerade som röda celler, gräna delar är representerade som gröna celler och blåa delar är representerade som blåa celler i nonogram griden och tabellen.
6. Verifiera att delar i bilden som är varken transparenta eller röda eller gröna eller blåa är representerade med röd eller grön eller blå färg i nonogram griden och tabellen.

### TC2.1.2 -  Test av metoden getRedBlueGreenWhiteGrid med rätt Imagepath och numberOfColumns och numberOfRows över 50 med hjälp av UI
- Indata:
1. Skapa en instans av GridGetter med rätt imagePath till en bild av sol, i PNG format och number of columns = 51 och number och numberOfROws = 51.
2. Anropa getRedBlueGreenWhiteGrid-metoden på den skapade instansen av GridGetter-klassen.
3. Skapa en UI-tabel (tabell i användargränssnittet) som representerar en nonogram-grid.
4. Lägg in den erhållna instansen av den redgreenbluewhite griden i den skapade UI-tabellen.
5. Markera celler i den UI tabellen:
  * Celler som är markerade som "red" i 2D ArrayList ska ha röd bakgrundsfärg.
  * Celler som är markerade som "green" i 2D ArrayList ska ha green bakgrundsfärg.
  * Celler som är markerade som "blue" i 2D ArrayList ska ha blue bakgrundsfärg.
  * Celler som är markerade som "white" i 2D ArrayList ska ha vit bakgrundsfärg.
  
- Förväntat resultat (Utdata):
1. Kontrollera att en nonogram tabell med 15 rader och 15 kolumner är skapad.
2. Jämför nonogram-tabellen med originalbilden och verifiera att den behåller de grundläggande former och konturer som finns i originalbilden.
3. Verifiera att transparenta delar i originalbilden är representerade som vita celler i nonogram grid.
4. Verifiera att delar av bilden som är inte transparenta (med icke-noll RGB-värde) är representerade som svarta celler i nonogram griden och tabellen.
5. Verifiera att roda delar i bilden är representerade som röda celler, gräna delar är representerade som gröna celler och blåa delar är representerade som blåa celler i nonogram griden och tabellen.
6. Verifiera att delar i bilden som är varken transparenta eller röda eller gröna eller blåa är representerade med röd eller grön eller blå färg i nonogram griden och tabellen.

#### TC2.1.3 -  Test av metoden getRedBlueGreenWhiteGrid med rätt Imagepath och numberOfColumns och numberOfRows över 10 (med olika andal av rader och columner) med hjälp av UI
- Indata:
1. Skapa en instans av GridGetter med rätt imagePath till en bild av sol, i PNG format och number of columns = 19 och number och numberOfROws = 18.
2. Anropa getRedBlueGreenWhiteGrid-metoden på den skapade instansen av GridGetter-klassen.
3. Skapa en UI-tabel (tabell i användargränssnittet) som representerar en nonogram-grid.
4. Lägg in den erhållna instansen av den redgreenbluewhite griden i den skapade UI-tabellen.
5. Markera celler i den UI tabellen:
  * Celler som är markerade som "red" i 2D ArrayList ska ha röd bakgrundsfärg.
  * Celler som är markerade som "green" i 2D ArrayList ska ha green bakgrundsfärg.
  * Celler som är markerade som "blue" i 2D ArrayList ska ha blue bakgrundsfärg.
  * Celler som är markerade som "white" i 2D ArrayList ska ha vit bakgrundsfärg.
  
- Förväntat resultat (Utdata):
1. Kontrollera att en nonogram tabell med 15 rader och 15 kolumner är skapad.
2. Jämför nonogram-tabellen med originalbilden och verifiera att den behåller de grundläggande former och konturer som finns i originalbilden, även om den är i en förenklad form på grund av det mindre antalet celler i griden.
3. Verifiera att transparenta delar i originalbilden är representerade som vita celler i nonogram grid.
4. Verifiera att delar av bilden som är inte transparenta (med icke-noll RGB-värde) är representerade som svarta celler i nonogram griden och tabellen.
5. Verifiera att roda delar i bilden är representerade som röda celler, gräna delar är representerade som gröna celler och blåa delar är representerade som blåa celler i nonogram griden och tabellen.
6. Verifiera att delar i bilden som är varken transparenta eller röda eller gröna eller blåa är representerade med röd eller grön eller blå färg i nonogram griden och tabellen.

### TC2.1.4 -  Test av metoden getRedBlueGreenWhiteGrid med rätt Imagepath och numberOfColumns och numberOfRows under 10 med hjälp av UI
- Indata:
1. Skapa en instans av GridGetter med rätt imagePath till en bild av sol, i PNG format och number of columns = 9 och number och numberOfROws = 9.
2. Anropa getRedBlueGreenWhiteGrid-metoden på den skapade instansen av GridGetter-klassen.
3. Skapa en UI-tabel (tabell i användargränssnittet) som representerar en nonogram-grid.
4. Lägg in den erhållna instansen av den redgreenbluewhite griden i den skapade UI-tabellen.
5. Markera celler i den UI tabellen:
  * Celler som är markerade som "red" i 2D ArrayList ska ha röd bakgrundsfärg.
  * Celler som är markerade som "green" i 2D ArrayList ska ha green bakgrundsfärg.
  * Celler som är markerade som "blue" i 2D ArrayList ska ha blue bakgrundsfärg.
  * Celler som är markerade som "white" i 2D ArrayList ska ha vit bakgrundsfärg.
  
- Förväntat resultat (Utdata):
1. Kontrollera att en nonogram tabell med 15 rader och 15 kolumner är skapad.
2. Jämför nonogram-tabellen med originalbilden och verifiera att den behåller de grundläggande former och konturer som finns i originalbilden, även om den är i en förenklad form på grund av det mindre antalet celler i griden.
3. Verifiera att transparenta delar i originalbilden är representerade som vita celler i nonogram grid.
4. Verifiera att delar av bilden som är inte transparenta (med icke-noll RGB-värde) är representerade som svarta celler i nonogram griden och tabellen.
5. Verifiera att roda delar i bilden är representerade som röda celler, gräna delar är representerade som gröna celler och blåa delar är representerade som blåa celler i nonogram griden och tabellen.
6. Verifiera att delar i bilden som är varken transparenta eller röda eller gröna eller blåa är representerade med röd eller grön eller blå färg i nonogram griden och tabellen.

## TC2 Test av HintGetter-klassen
### TC 3.1 Test av metoden getHint för en svartvit grid med lämpliga koordinater.
- Indata
1. TC1.1.1
2. Skapa en instans av HintGetter med svartvita gridden från TC1.1
3. Anropa getHint-metoden på den skapade instansen av HintGetter-klassen med cellsRowIndex = 4 och cellsColumnIndex = 6 och skriv ut resultatet i consolen med System out println.

- Förväntat resultat (Utdata):
1. Färgen på cellen som beffiner sig i rad med index 4 - femte raden (första raden - index 0, andra raden - index 1...) och i column 6 - sjunde raden är utskriven i consolen.

### TC 3.2 Test av metoden getHint för en svartvit grid med olämpliga koordinater.
- Indata
1. TC1.1
2. Skapa en instans av HintGetter med svartvita gridden från TC1.1
3. Anropa getHint-metoden på den skapade instansen av HintGetter-klassen med cellsRowIndex = 19 och cellsColumnIndex = 6 och skriv ut resultatet i consolen med System out println.

- Förväntat resultat (Utdata):
1. Följande felmeddelande är presenterad: 
* "Row index cannot have index less than 0 or bitgger than 15."

### TC 3.2.2 Test av metoden getHint för en svartvit grid med olämpliga koordinater (index is less than 0).
- Indata
1. TC1.1
2. Skapa en instans av HintGetter med svartvita gridden från TC1.1
3. Anropa getHint-metoden på den skapade instansen av HintGetter-klassen med cellsRowIndex = 13 och cellsColumnIndex = -5 och skriv ut resultatet i consolen med System out println.

- Förväntat resultat (Utdata):
1. Följande felmeddelande är presenterad: 
* "Column index cannot have index less than 0 or bitgger than 14."

### TC 3.3 Test av metoden getHint för en felaktig grid med lämpliga koordinater
- Indata
1. TC1.1
2. Skapa en instans av HintGetter utan grid.
3. Anropa getHint-metoden på den skapade instansen av HintGetter-klassen med cellsRowIndex = 13 och cellsColumnIndex = 5 och skriv ut resultatet i consolen med System out println.

- Förväntat resultat (Utdata):
1. Följande felmeddelande är presenterad: 
* ""Please add image grid. Image grid cannot be 0.""

### TC 4.1 Test av metoden getHint för en RGB-grid med lämpliga koordinater.
- Indata
1. TC2.1
2. Skapa en instans av HintGetter med RGB-gridden från TC2.1
3. Anropa getHint-metoden på den skapade instansen av HintGetter-klassen med cellsRowIndex = 4 och cellsColumnIndex = 6 och skriv ut resultatet i consolen med System out println.

- Förväntat resultat (Utdata):
1. Färgen på cellen som beffiner sig i rad med index 4 - femte raden (första raden - index 0, andra raden - index 1...) och i column 6 - sjunde raden är utskriven i consolen.

## Test av BWCellCounts-klassen
### TC5.1 Test av metoden getAllRowsBlackCellCounts med den lämpliga svartvita griden.
1. TC1.1
2. Skapa en instans av BWCellCounts med svartvita gridden från TC1.1
3. Anropa getAllRowsBlackCellCounts på den skapade instansen av BWCellCounts.
4.  Lägg till ArrayList (från resultatet från föregående steget) med samma index som radens index i ett cell i slutet raden i nonogram-tabellen.

- Förväntat resultat (Utdata):
1. Kontrollera att en cell er skapad på slutet av varje rad av UI nonogram tebellen.
2. Verifiera att nyskapade celler innehåller nummer som indikerar hur många sammanhängande svarta celler som bör finnas i den raden med mellanrum mellan grupper av svarta celler.

### TC5.2 Test av metoden getAllRowsBlackCellCounts med den olämpliga svartvita griden.
1. Skapa en instans av BWCellCounts utan en grid.
2. Anropa getAllRowsBlackCellCounts på den skapade instansen av BWCellCounts.
3.  Lägg till ArrayList (från resultatet från föregående steget) med samma index som radens index i ett cell på slutet raden med samma index i nonogram-tabellen.

- Förväntat resultat (Utdata):
1. Kontrollera att ett felmeddelande är presenterad.

### TC6.1 Test av metoden getAllRowsBlackCellCounts med den lämpliga svartvita griden.
1. TC1.1
2. Skapa en instans av BWCellCounts med vartvita gridden från TC1.1
3. Anropa getAllRowsBlackCellCounts på den skapade instansen av BWCellCounts.
4.  Lägg till ArrayList (från resultatet från föregående steget) med samma index som columnens index i ett cell I början kolumnen med samma index i nonogram-tabellen.

- Förväntat resultat (Utdata):
1. Kontrollera att en cell er skapad i början av varje kolumn av UI nonogram tebellen.
2. Verifiera att nyskapade celler innehåller nummer som indikerar hur många sammanhängande svarta celler som bör finnas i den kolumnen med mellanrum mellan grupper av svarta celler.

### TC7.1 Test av metoden getColorsOfCellCountsColumns med den lämpliga rgb-griden.
1. TC2.1
2. Skapa en instans av RGBCellCounts med rgb-gridden från TC1.1
3. Anropa getColorsOfCellCountsColumns på den skapade instansen av RGBCellCounts.
4.  Lägg till första bokstaver från strängar i ArrayListen (från resultatet från föregående steget) med samma index som kolumnens index i ett cell i början kolumnen med samma index i nonogram-tabellen.

- Förväntat resultat (Utdata):
1. Kontrollera att en cell er skapad i början av varje kolumn av UI nonogram tebellen.
2. Verifiera att nyskapade celler innehåller första bokstaver på färger röd, grön eller blå som indikerar hur många sammanhängande  celler av den färg som bör finnas i den kolumnen.

### TC8.1 Test av metoden getColorsOfCellCountsRows med den lämpliga rgb-griden.
1. TC2.1
2. Skapa en instans av RGBCellCounts med rgb-gridden från TC1.1
3. Anropa getColorsOfCellCountsRows på den skapade instansen av RGBCellCounts.
4.  Lägg till första bokstaver från strängar i ArrayListen (från resultatet från föregående steget) med samma index som radens index i ett cell i slutet av raden med samma index i nonogram-tabellen.

- Förväntat resultat (Utdata):
1. Kontrollera att en cell er skapad i slutet av varje rad av UI nonogram tebellen.
2. Verifiera att nyskapade celler innehåller första bokstaver på färger röd, grön eller blå som indikerar hur många sammanhängande  celler av den färg som bör finnas i den raden.

## Test av RGBCellCounts-klassen
### TC9.1 Test av metoden getColorsCellCountsColumns med den lämpliga rgb-griden.
1. TC2.1
2. Skapa en instans av RGBCellCounts med rgb-gridden från TC1.1
3. Anropa  getColorsCellCountsColumns på den skapade instansen av RGBCellCounts.
4.  Lägg till ArrayList (från resultatet från föregående steget) med samma index som kolumnens index i ett cell i början av kolumnen med samma index i nonogram-tabellen.

- Förväntat resultat (Utdata):
1. Kontrollera att en cell er skapad i början av varje kolumn av UI nonogram tebellen.
2. Verifiera att nyskapade celler innehåller nummer som indikerar hur många sammanhängande röda, gröna eller blåa celler som bör finnas i den kolumnen.

### TC9.2 Test av metoden getColorsCellCountsColumns med den olämpliga rgb-griden.
1. Skapa en instans av RGBCellCounts utan en grid.
2. Anropa getColorsCellCountsColumns på den skapade instansen av RGBCellCounts.
3.  Lägg till ArrayList (från resultatet från föregående steget) med samma index som kolumnens index i ett cell i början av kolumnen med samma index i nonogram-tabellen.

- Förväntat resultat (Utdata):
1. Kontrollera att ett felmeddelande är presenterad.

### TC10.1 Test av metoden getColorCellCountsRows med den lämpliga rgb-griden.
1. TC2.1
2. Skapa en instans av RGBCellCounts med vartvita gridden från TC1.1
3. Anropa getColorCellCountsRows på den skapade instansen av RGBCellCounts.
4.  Lägg till ArrayList (från resultatet från föregående steget) med samma index som radens index i ett cell i slutet av raden med samma index i nonogram-tabellen.

- Förväntat resultat (Utdata):
1. Kontrollera att en cell er skapad i slutet av varje kolumn av UI nonogram tebellen.
2. Verifiera att nyskapade celler innehåller nummer som indikerar hur många sammanhängande röda, gröna eller blåa celler som finnas i den raden.
