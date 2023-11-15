# Testspecification

## Test av NonogramGridCreator-klassen
### TC1.1 -  Test av metoden getBlackAndWhiteGrid med rätt Imagepath och numberOfColumns och numberOfRows över 10 med hjälp av UI
- Indata:
1. Starta applikationen.
  
- Förväntat resultat (Utdata):
1. Kontrollera att Java Swing-fönstret med namnet 'Nonogram app 1 - 15x15' har skapats.
2. Kontrollera att 'Nonogram app 1 - 15x15' innehåller en nonogram tabell med 15 rader och 15 kolumner.
3. Jämför nonogram-tabellen med originalbilden och verifiera att den behåller de grundläggande former och konturer som finns i originalbilden, även om den är i en förenklad form på grund av det mindre antalet celler i griden.
Original bild: 
![Original bild](../../src/images/sun.png)
4. Verifiera att transparenta delar i originalbilden är representerade som vita celler i nonogram grid.
5. Verifiera att delar av bilden som är inte transparenta (med icke-noll RGB-värde) är representerade som svarta celler i nonogram griden och tabellen.

### TC1.1.2 -  Test av metoden getBlackAndWhiteGrid med rätt Imagepath och numberOfColumns och numberOfRows över 50 med hjälp av UI
- Indata:
1. Starta applikationen.

- Förväntat resultat (Utdata):
1. Kontrollera att Java Swing-fönstret med namnet 'Nonogram app 2 - 55x55' har skapats.
2. Kontrollera att'Nonogram app 2 - 55x55' innehåller en nonogram tabell med 55 rader och 55 kolumner.
3. Jämför nonogram-tabellen med originalbilden och verifiera att den behåller de grundläggande former och konturer som finns i originalbilden, även om den är i en förenklad form på grund av det mindre antalet celler i griden.
Original bild: 
![Original bild](../../src/images/sun.png)
4. Verifiera att transparenta delar i originalbilden är representerade som vita celler i nonogram grid.
5. Verifiera att delar av bilden som är inte transparenta (med icke-noll RGB-värde) är representerade som svarta celler i nonogram griden och tabellen.

#### TC1.1.3 -  Test av metoden getBlackAndWhiteGrid med rätt Imagepath och numberOfColumns och numberOfRows över 10 (med olika antal av rader och columner) med hjälp av UI
- Indata:
1. Starta applikationen.
  
- Förväntat resultat (Utdata):
1. Kontrollera att Java Swing-fönstret med namnet 'Nonogram app 3 - 19x15' har skapats.
2. Kontrollera att'Nonogram app 3 - 19x15' innehåller en nonogram tabell med 15 rader och 19 kolumner.
3. Jämför nonogram-tabellen med originalbilden och verifiera att den behåller de grundläggande former och konturer som finns i originalbilden, även om den är i en förenklad form på grund av det mindre antalet celler i griden.
Original bild: 
![Original bild](../../src/images/sun.png)
4. Verifiera att transparenta delar i originalbilden är representerade som vita celler i nonogram grid.
5. Verifiera att delar av bilden som är inte transparenta (med icke-noll RGB-värde) är representerade som svarta celler i nonogram griden och tabellen.

### TC1.1.4 -  Test av metoden getBlackAndWhiteGrid med rätt Imagepath och numberOfColumns och numberOfRows under 10 med hjälp av UI
- Indata:
1. Starta applikationen.
  
- Förväntat resultat (Utdata):
1. Kontrollera att Java Swing-fönstret med namnet 'Nonogram app 4 5x5' har skapats.
2. Kontrollera att'Nonogram app 4 5x5' innehåller en nonogram tabell med 5 rader och 5 kolumner.
3. Jämför nonogram-tabellen med originalbilden och verifiera att den behåller de grundläggande former och konturer som finns i originalbilden, även om den är i en förenklad form på grund av det mindre antalet celler i griden.
Original bild: 
![Original bild](../../src/images/sun.png)
4. Verifiera att transparenta delar i originalbilden är representerade som vita celler i nonogram grid.
5. Verifiera att delar av bilden som är inte transparenta (med icke-noll RGB-värde) är representerade som svarta celler i nonogram griden och tabellen.

### TC1.2 Test av metoden getBlackAndWhiteGrid med felaktigt Imagepath och numberOfColumns och numberOfRows under 10 med hjälp av UI
- Indata:
1. Starta applikationen.

- Förväntat resultat (Utdata):
1. Kontrollera att Java Swing-fönstret med namnet 'Nonogram app 5 - 5x5' INTE har skapats.
2. Kontrollera att följande felmeddelande är presenterad
* "Can't read input file"

### TC1.2.1 Test av metoden getBlackAndWhiteGrid med rätt Imagepath, felaktig numberOfColumns och  numberOfRows under 10 med hjälp av UI
- Indata:
1. Starta applikationen.

- Förväntat resultat (Utdata):
1. Kontrollera att Java Swing-fönstret med namnet 'Nonogram app 6 - 0x5' INTE har skapats.
2. Kontrollera att följande felmeddelande är presenterad
* "Number of columns in image grid cannot be less than 1."

## TC3 Test av HintGetter-klassen
### TC 3.1 Test av metoden getHint för en svartvit grid med lämpliga koordinater.
- Indata
1. Starta applikationen.

- Förväntat resultat (Utdata):
1. "The color of the cell located in the fourth row and the sixth column in Nonogram app 1 - 15x15 is black" är utskriven i consolen.

### TC 3.2 Test av metoden getHint för en svartvit grid med olämpliga koordinater.
- Indata
1. Starta applikationen.

- Förväntat resultat (Utdata):
1. "The color of the cell located in the nineteenth row and the sixth column in Nonogram app 1 - 15x15 is black" är INTE utskriven i consolen.
2. Följande felmeddelande är presenterad i consolen: 
* "Row index cannot have index less than 0 or bigger than 14."

### TC 3.2.2 Test av metoden getHint för en svartvit grid med olämpliga koordinater (index is less than 0).
- Indata
1. Starta applikationen.

- Förväntat resultat (Utdata):
1. Följande felmeddelande är presenterad i konsolen:: 
* "An error has occurred:Column index cannot have index less than 0 or bitgger than 54."

### TC 3.3 Test av metoden getHint för en felaktig grid med lämpliga koordinater
- Indata
1. Starta applikationen.

- Förväntat resultat (Utdata):
1. Följande felmeddelande är presenterad i konsolen: 
* "Please add image grid. Image grid cannot be 0."

## Test av BlackWhiteCellCounts-klassen
### TC5.1 Test av metoden getBlackCellCountsInAllRows med den lämpliga svartvita griden.
1. Starta applikationen.

- Förväntat resultat (Utdata):
1. Kontrollera att celler för nonogram counts är skapade i början av varje rad av nonogram tebellen i Nonogram app 1 - 15x15 UI.
2. Verifiera att nyskapade celler innehåller nummer som indikerar hur många sammanhängande svarta celler som bör finnas i den raden med mellanrum mellan grupper av svarta celler.

### TC6.1 Test av metoden getBlackCellCountsInAllRows med den lämpliga svartvita griden.
1. Starta applikationen.

- Förväntat resultat (Utdata):
1. Kontrollera att celler för nonogram counts är skapade i början av varje kolumn av UI nonogram tebellen i Nonogram app 1 - 15x15 UI.
2. Verifiera att nyskapade celler innehåller nummer som indikerar hur många sammanhängande svarta celler som bör finnas i den kolumnen med mellanrum mellan grupper av svarta celler.
