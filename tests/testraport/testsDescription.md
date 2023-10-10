# Nonogram Generator - Tests
### Modul beskrivning
Nonogram generator är en Java modul som används används för att konvertera bilder i png-format till en 2D-array som innehåller färgen på varje pixel som används för ett nonogramspel. Du kan dela upp bilden i antal celler för nonogram efter önskemål genom att lägga till önskat antal rader och kolumner, och du kan generera en 2D-array för svartvita nonogram eller röd, grön, blå och vit nonogram.

### Test beskrivnig
- Vad som testats: Modul Nonogram-generator
- Hur det testats: Manuell testing genom en testApp med hjälp av UI

#### Test av NonogramGridCreator-klassen
1. Test av metoden getBlackAndWhiteGrid:
- Skapa en instans av NonogramGridCreator med lämpliga parametrar för bilden.
  Anropa metoden getBlackAndWhiteGrid och kontrollera om resultatet är korrekt och överensstämmer med förväntningarna för en svartvit grid.
- Skapa en instans av NonogramGridCreator med olämpliga parametrar för bilden.
  Anropa metoden getBlackAndWhiteGrid och kontrollera att flemeddelande är presenterad.

#### Test av HintGetter-klassen
3. Test av metoden getHint för en svartvit grid:
- Skapa en instans av HintGetter med den lämpliga svartvita griden. Anropa metoden getHint med specifika lämpliga koordinater.
- Skapa en instans av HintGetter med den lämpliga svartvita griden. Anropa metoden getHint med specifika olämpliga koordinater.
Kontrollera att flemeddelande är presenterad.
- Skapa en instans av HintGetter med den olämpliga svartvita griden. Anropa metoden getHint med olämpliga koordinater.
Kontrollera att flemeddelande är presenterad.

4. Test av metoden getHint för en RGB-grid:
- Skapa en instans av HintGetter med den lämpliga RGB-griden. Anropa metoden getHint med specifika koordinater.
Kontrollera om det resulterande resultatet är korrekt och överensstämmer med förväntningarna.

#### Test av BlackWhiteCellCounts-klassen
5. Test av metoden getBlackCellCountsInAllColumns:
- Skapa en instans av BlackWhiteCellCounts med den lämpliga svartvita griden.
Anropa metoden getBlackCellCountsInAllColumns och kontrollera om kolumn räkningar är korrekta och överensstämmer med förväntningarna.
- Skapa en instans av BlackWhiteCellCounts med den olämpliga svartvita griden.
Anropa metoden getBlackCellCountsInAllColumns och kontrollera att ett felmeddelande är presenterad.

6. Test av metoden getBlackCellCountsInAllRows:
- Skapa en instans av BWCellCounts med den lämpliga svartvita griden.
Anropa metoden getBlackCellCountsInAllRows och kontrollera om radnumren är korrekta och överensstämmer med förväntningarna.
