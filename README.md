# Nevezés

#### Adottak a következő osztályok.

```java
public class Alcoholic {
    public boolean isDrunk() {
        return true;
    }
}
```
```java
public class Golya extends Alcoholic {

    private enum signature {signed, declined}

    private String neptun;
    private int felviPoint;
    private int mentalhealth;
    private int currentSemester;
    private short money;
    private signature signed = signature.declined;

    private Golya() {
        isDrunk();
    }

    public boolean hasGirlfriend() {
        return false;
    }

    public boolean useFelviPoint() {
        return false;
    }

    public boolean uni() {

        while(mentalhealth >= 0) {
            mentalhealth--;
            currentSemester++;

            if(currentSemester >= 12) {
                money = 0;
                mentalhealth = 0;
                isDrunk();
            }
            if(signed.equals(signature.declined)){
                return isDrunk();
            }
        }
        return isDrunk();
    }

}
```
```java
public class GolyaFutam {

    private Golya golyci;
    private boolean singedUp;

    public GolyaFutam(Golya golyo) {
        signUp(golyo);
    }

    public void signUp(Golya golyo){
        golyci = golyo;
        singedUp = true;
    }
}
```
###### Sajnos, mikor elkezdtem programozni, még nem tudtam ilyen szofisztikált módon kódolni, sőt a java-t egyáltalán nem ismertem. Írtam is annak idején egy C kódot, amiben egy nagyon fontos üzenetet rejtettem el. De sajnos már nem tudom megfejteni, hogy mit is csinál a kódom.
#### Ha át tudnám írni kicsit olvashatóbbra a kódot, rá tudnék jönni, hogy mi is az az üzenet:
```c
#define BUT ;
    #define SO ;
#define SEMMI (int)NULL
        #define SZAM 0xD
#define kdGd_ return
    #define theEND )
    #include <stdio.h>
    #define PONT '.'
#define DONNO "%s"
#define h6_d [
    #define KISAUTO char
int main( theEND {
KISAUTO Hdu__d[0xF] BUT

#define BLA [
Hdu__d BLA SZAM] = 'i' SO SO Hdu__d BLA 0xE - 0x0] = SEMMI;
    Hdu__d[2] = 't';
        #include <stdbool.h>
3 h6_d Hdu__d] = PONT SO Hdu__d[5] = 121 BUT Hdu__d BLA 6] = '/' SO
        Hdu__d[1] = 'i' SO if(!(true) || ((true) && !(!(1))) && false);
{
    Hdu__d[7] = 062 BUT Hdu__d BLA 010] = 'U';
}
    #define KILENC '0'
    Hdu__d BLA 2 * (7 - 2 theEND ] = 8 + KILENC BUT Hdu__d[0xB] = 'G' SO Hdu__d h6_d 014] = 'J'; SO
Hdu__d h6_d 4 + 4 + 4 - 4 + 4 - 4 - 4] = 'l' SO
        #define $dolla (
    Hdu__d[0x9] = '0';;  ;;; ; Hdu__d[SEMMI] = 'b' BUT Hdu__d h6_d 0] = 0 BUT 
printf $dolla DONNO , Hdu__d) BUT kdGd_ SEMMI; }
```
