# The Multiple Traveling Salesman Problem

Project consist of two part.I n First part we generated 100.000 random valid solution and second part include we applied a heuristic algorithm to our fixed
destination of the multi-depot mTSP.
The heuristic will iteratively work on the solution (best of the 100,000 random solutions) obtained from the Part-I. In Part-II, we will define five different move operations,
 which will be detailed in the following subsections. In each iteration, one move operation will be selected (among five) based on a random manner, and then it will be applied to the current solution.
  If the move improves the solution (i.e., lessen the total distance travelled) then, we will update the best solution at hand. If not, next iteration will be continued.
  After the move operations we obtained shorter value.
  
  Move Operations:
  *swapNodesInRoute
  *swapHubWithNodeInRoute
  *swapNodesBetweenRoutes
  *insertNodeInRoute
  *insertNodeBetweenRoutes
  
  Program will create solution_d?s?.json file after the execution. "?" in the name depend on inputs.
  
  

The [Multiple Traveling Salesman Problem](https://neos-guide.org/content/multiple-traveling-salesman-problem-mtsp) (*m*TSP) in which more than one salesman is allowed is a generalization of the Traveling Salesman Problem (TSP).
Given a set of cities, one depot (where *m* salesmen are located), and a cost metric, the objective of the *m*TSP is to determine a set of routes for *m* salesmen so as to minimize the total cost of the *m* routes. 
The cost metric can represent cost, distance, or time. The requirements on the set of routes are:

* All of the routes must start and end at the (same) depot.
* There must be at least one city (except depot) in each route.
* Each city must be visited exactly once by only one salesman.

**Multiple depots**: Instead of one depot, the multi-depot *m*TSP has a set of depots, with m<sub>j</sub> salesmen at each depot *j*. 
In the *fixed destination* version, a salesman returns to the same depot from which he started.

Parameters:

-d depots default value:4
-s salesman or vehicle default value:2
-v verbose ( using city names for solution instead of numbers)

For example, `java -jar target/mTSP.jar -d 5 -s 2 -v` would produce something like below.


Notice that the last line includes the cost metric: the total distance travelled by all salesmen.

```yaml
Depot1: İÇEL
  Route1: ZONGULDAK,GİRESUN,VAN,OSMANİYE,BİNGÖL,ELAZIĞ,ŞIRNAK,BAYBURT,IĞDIR
  Route2: BURDUR,AYDIN,MANİSA,TUNCELİ,ANKARA,ÇANKIRI,KIRIKKALE
Depot2: DİYARBAKIR
  Route1: KIRŞEHİR,KAYSERİ,KÜTAHYA,ARTVİN,İZMİR,HATAY,UŞAK,ISPARTA,KAHRAMANMARAŞ,İSTANBUL
  Route2: KONYA,ŞANLIURFA,ADIYAMAN,MALATYA,SİVAS,BATMAN,MUŞ,SİİRT
Depot3: ERZURUM
  Route1: AĞRI,KARAMAN,BOLU,ANTALYA,KASTAMONU,ÇORUM,ÇANAKKALE,SAKARYA,GÜMÜŞHANE,BİTLİS
  Route2: ERZİNCAN,GAZİANTEP,BURSA,HAKKARİ
Depot4: ESKİŞEHİR
  Route1: MUĞLA,BARTIN,NİĞDE,RİZE,NEVŞEHİR
  Route2: YOZGAT,KARABÜK,BALIKESİR,TEKİRDAĞ,AFYON,YALOVA
Depot5: TOKAT
  Route1: DÜZCE,TRABZON,MARDİN,ARDAHAN,KARS,ORDU,KOCAELİ,DENİZLİ,KIRKLARELİ,EDİRNE
  Route2: AKSARAY,BİLECİK,ADANA,SİNOP,AMASYA,KİLİS,SAMSUN
**Total cost is 52308
```

