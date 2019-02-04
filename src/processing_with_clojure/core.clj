(ns processing-with-clojure.core
  (:gen-class))

(def aluno1 {:name "Felipe" :age 27 :materia "matematica" :nota 10})
(def aluno2 {:name "Maria" :age 24 :materia "portugues" :nota 8})
(def aluno3 {:name "Joao" :age 18 :materia "matematica" :nota 4})

(def aluno4 {:name "Mariana" :age 18 :materia "matematica" :nota 4})

(def aluno5 {:name "Felipe" :age 26 :materia "biologia" :nota 10})

(def listaAlunos (list aluno1 aluno2 aluno3))


(def nameList (list "Bob" "Mary" "Charles" "Steve" "Jack" "Karen"
                    "Lori"
                    "Lisa"
                    "Julie"
                    "Felipe"
                    "Donna"
                    "Susan"
                    "Mary"
                    ; "Jacob" "Mason" "Ethan" "Noah" "William" "Liam" "Michael" "Jayden" "Alexander" "Aiden" "Daniel" "Matthew" "Elijah" "James" "Anthony" "Benjamin" "Joshua" "Andrew" "Joseph" "David" "Jackson" "Logan" "Christopher" "Gabriel" "Samuel" "Ryan" "Lucas" "John" "Nathan" "Isaac" "Dylan" "Caleb" "Christian" "Jonathan" "Landon" "Carter" "Luke" "Owen" "Brayden" "Gavin" "Wyatt" "Isaiah" "Henry" "Eli" "Hunter" "Jack" "Evan" "Jordan" "Nicholas" "Tyler" "Aaron" "Jeremiah" "Julian" "Cameron" "Levi" "Brandon" "Angel" "Austin" "Connor" "Robert" "Adrian" "Charles" "Thomas" "Sebastian" "Colton" "Jaxon" "Zachary" "Ayden" "Kevin" "Dominic" "Blake" "Jose" "Oliver" "Justin" "Bentley" "Jason" "Ian" "Chase" "Josiah" "Xavier" "Parker" "Adam" "Cooper" "Nathaniel" "Jace" "Grayson" "Carson" "Tristan" "Nolan" "Luis" "Brody" "Juan" "Hudson" "Bryson" "Carlos" "Easton" "Kayden" "Alex" "Damian" "Ryder" "Jesus" "Cole" "Micah" "Vincent" "Max" "Jaxson" "Eric" "Asher" "Hayden" "Diego" "Miles" "Steven" "Maxwell" "Ivan" "Elias" "Aidan" "Bryce" "Antonio" "Timothy" "Giovanni" "Bryan" "Santiago" "Colin" "Richard" "Braxton" "Kaleb" "Kyle" "Kaden" "Jonah" "Miguel" "Preston" "Lincoln" "Riley" "Leo" "Victor" "Brady" "Mateo" "Jeremy" "Jaden" "Brian" "Patrick" "Ashton" "Declan" "Joel" "Sean" "Gael" "Sawyer" "Alejandro" "Marcus" "Jesse" "Caden" "Leonardo" "Jake" "Kaiden" "Wesley" "Camden" "Edward" "Brantley" "Roman" "Silas" "Jude" "Axel" "Grant" "Cayden" "Emmanuel" "George" "Malachi" "Maddox" "Bradley" "Alan" "Weston" "Gage" "Devin" "Greyson" "Kenneth" "Mark" "Oscar" "Tanner" "Rylan" "Nicolas" "Harrison" "Derek" "Ezra" "Peyton" "Tucker" "Emmett" "Avery" "Cody" "Calvin" "Abraham" "Paul" "Abel" "Andres" "Theodore" "Jorge" "Kai" "Collin" "Ezekiel" "Omar" "Jayce" "Bennett" "Conner" "Trevor" "Peter" "Eduardo" "Maximus" "Jaiden" "Jameson" "Seth" "Kingston" "Javier" "Travis" "Garrett" "Everett" "Graham" "Xander" "Cristian" "Damien" "Griffin" "Ryker" "Corbin" "Myles" "Luca" "Zane" "Francisco" "Ricardo" "Stephen" "Alexis" "Zayden" "Iker" "Drake" "Lukas" "Charlie" "Spencer" "Zion" "Erick" "Josue" "Chance" "Trenton" "Jeffrey" "Elliot" "Paxton" "Fernando" "Shane" "Landen" "Keegan" "Amir" "Zander" "Manuel" "Andre" "Raymond" "Israel" "Simon" "Mario" "Cesar" "Jaylen" "King" "Johnathan" "Troy" "Dean" "Clayton" "Dominick" "Jasper" "Tyson" "Martin" "Kyler" "Hector" "Edgar" "Cash" "Edwin" "Marco" "Judah" "Shawn" "Donovan" "Kameron" "Andy" "Elliott" "Dante" "Anderson" "Braylon" "Sergio" "Drew" "Johnny" "Cruz" "Rafael" "Dalton" "Gregory" "Skyler" "Lane" "Erik" "Finn" "Reid" "Gunner" "Jared" "Caiden" "Holden" "Emilio" "Fabian" "Aden" "Brendan" "Rowan" "Emiliano" "Braden" "Jase" "Jax" "Emanuel" "Lorenzo" "Amari" "Roberto" "Beau" "Angelo" "Louis" "Derrick" "Beckett" "Felix" "Dawson" "Pedro" "Brennan" "Frank" "Quinn" "Dallas" "Romeo" "Maximiliano" "Joaquin" "Waylon" "Milo" "Braylen" "Allen" "Colt" "Ruben" "Dakota" "Julius" "August" "Grady" "Cohen" "Brock" "Kellen" "Brycen" "Desmond" "Malik" "Colby" "Nehemiah" "Leland" "Marcos" "Jett" "Ty" "Marshall" "Taylor" "Karter" "Phillip" "Corey" "Dillon" "Ali" "Adan" "Arthur" "Leon" "Maverick" "Titus" "Brooks" "Tristen" "Dexter" "Keith" "Emerson" "Karson" "Landyn" "Pablo" "Armando" "Enrique" "Knox" "Cade" "Reed" "Gerardo" "Kellan" "Jayson" "Barrett" "Walter" "Dustin" "Ronald" "Kolton"
                    "Phoenix"
                    ;"Sophia" "Emma" "Isabella" "Olivia" "Ava" "Emily" "Abigail" "Mia" "Madison" "Elizabeth" "Chloe" "Ella" "Avery" "Addison" "Aubrey" "Lily" "Natalie" "Sofia" "Charlotte" "Zoey" "Grace" "Hannah" "Amelia" "Harper" "Lillian" "Samantha" "Evelyn" "Victoria" "Brooklyn" "Zoe" "Layla" "Hailey" "Leah" "Anna" "Kaylee" "Aaliyah" "Gabriella" "Allison" "Nevaeh" "Alexis" "Audrey" "Savannah" "Sarah" "Alyssa" "Claire" "Taylor" "Riley" "Camila" "Arianna" "Ashley" "Brianna" "Sophie" "Peyton" "Bella" "Khloe" "Genesis" "Alexa" "Serenity" "Kylie" "Aubree" "Scarlett" "Stella" "Maya" "Katherine" "Julia" "Lucy" "Madelyn" "Autumn" "Makayla" "Kayla" "Mackenzie" "Lauren" "Gianna" "Ariana" "Faith" "Alexandra" "Melanie" "Sydney" "Naomi" "Caroline" "Bailey" "Morgan" "Ellie" "Kennedy" "Jasmine" "Eva" "Skylar" "Kimberly" "Violet" "Molly" "Trinity" "Aria" "Jocelyn" "London" "Lydia" "Madeline" "Reagan" "Piper" "Annabelle" "Andrea" "Maria" "Brooke" "Payton" "Paisley" "Ruby" "Paige" "Nora" "Mariah" "Rylee" "Lilly" "Brielle" "Jade" "Destiny" "Nicole" "Mila" "Kendall" "Liliana" "Kaitlyn" "Sadie" "Natalia" "Mary" "Jordyn" "Vanessa" "Mya" "Penelope" "Isabelle" "Alice" "Reese" "Gabrielle" "Hadley" "Katelyn" "Rachel" "Angelina" "Isabel" "Eleanor" "Clara" "Jessica" "Brooklynn" "Elena" "Vivian" "Aliyah" "Sara" "Laila" "Eliana" "Amy" "Lyla" "Juliana" "Adriana" "Valeria" "Elise" "Makenzie" "Mckenzie" "Quinn" "Delilah" "Cora" "Kylee" "Rebecca" "Gracie" "Izabella" "Josephine" "Eden" "Alaina" "Michelle" "Jennifer" "Catherine" "Aurora" "Valentina" "Stephanie" "Valerie" "Jayla" "Willow" "Hazel" "Daisy" "Melody" "Alana" "Margaret" "Summer" "Melissa" "Kinsley" "Kinley" "Ariel" "Lila" "Ryleigh" "Giselle" "Haley" "Julianna" "Ivy" "Alivia" "Brynn" "Keira" "Kate" "Aniyah" "Angela" "Daniela" "Londyn" "Harmony" "Hayden" "Adalyn" "Megan" "Allie" "Gabriela" "Alayna" "Presley" "Jenna" "Alexandria" "Ashlyn" "Jada" "Adrianna" "Fiona" "Norah" "Emery" "Amaya" "Miranda" "Maci" "Cecilia" "Ximena" "Ana" "Hope" "Shelby" "Katie" "Jordan" "Eliza" "Callie" "Luna" "Leilani" "Mckenna" "Angel" "Genevieve" "Isla" "Makenna" "Lola" "Danielle" "Leila" "Tessa" "Chelsea" "Adelyn" "Adeline" "Camille" "Mikayla" "Esther" "Adalynn" "Sienna" "Jacqueline" "Arabella" "Emerson" "Athena" "Maggie" "Lucia" "Lexi" "Ayla" "Alexia" "Diana" "Josie" "Juliet" "Addyson" "Allyson" "Delaney" "Rose" "Teagan" "Marley" "Amber" "Amanda" "Erin" "Kathryn" "Kayleigh" "Leslie" "Emilia" "Kelsey" "Kenzie" "Alina" "Kaydence" "Alicia" "Sabrina" "Alison" "Paris" "Lilliana" "Ashlynn" "Sierra" "Laura" "Cassidy" "Iris" "Alondra" "Christina" "Kyla" "Carly" "Jillian" "Madilyn" "Evangeline" "Cadence" "Madeleine" "Kyleigh" "Nina" "Nadia" "Lyric" "Raegan" "Giuliana" "Georgia" "Briana" "Elliana" "Haylee" "Phoebe" "Yaretzi" "Fatima" "Selena" "Charlie" "Miriam" "Annabella" "Abby" "Dakota" "Juliette" "Lilah" "Daniella" "Bianca" "Noelle" "Mariana" "Parker" "Veronica" "Gemma" "Cheyenne" "Marissa" "Heaven" "Vivienne" "Joanna" "Brynlee" "Aubrie" "Mallory" "Journey" "Nyla" "Tatum" "Jazmine" "Cali" "Carmen" "Gia" "Macy" "Anastasia" "Elaina" "Ainsley" "Heidi" "Baylee" "Jane" "Miley" "Ruth" "Raelynn" "Alessandra" "Kiara" "Adelaide" "Camryn" "Hanna" "Finley" "Maddison" "Lia" "Bethany" "Malia" "Karen" "Jayda" "Jazmin" "Kelly" "Esmeralda" "Kira" "Lena" "Kamryn" "Kamila" "Eloise" "Olive" "Kara" "Karina" "Rylie" "Elisa" "Tiffany" "Nayeli" "Macie" "Skyler" "Angelica" "Addisyn" "Annie" "Briella" "Caitlyn" "Amiyah" "Jayden" "Fernanda" "Maliyah" "Charlee" "Elle" "Julie" "Crystal" "Imani" "Kendra" "Talia" "Angelique" "Jazlyn" "Lucille" "Elsie" "Guadalupe" "Alejandra" "Emely" "Anya" "April" "Madelynn" "Myla" "Breanna" "Scarlet" "Julissa" "Helen" "Rosalie" "Madisyn" "Brittany" "Kyra" "Brylee" "Jayleen" "Karla" "Arielle" "Arya" "Miracle" "Kailey" "Harley" "Sarai" "Kaelyn" "Aleah" "Cynthia" "Kali" "Daphne" "Cassandra" "Marilyn" "Caitlin" "Holly" "Janelle" "Katelynn" "Kaylie" "Itzel" "Carolina" "Michaela" "Monica" "Haven" "Bristol" "June" "Jamie" "Janiyah" "Rebekah" "Serena" "Tiana" "Camilla" "Lana" "Audrina" "Nylah" "Skye" "Dayana" "Braelyn" "Savanna" "Raelyn" "Sasha" "Madalyn" "Perla" "Bridget" "Rowan" "Logan"
                    "Aniya"
                    ))

(def subjectList (list "Math" "English" "History" "Music" "Portuguese" "Biology" "Science" "Designer" "Geography" "Art" "Physical Education"))

(defn bestStudentsFilter [list] (filter #(> (:grade %) 5) list))
(defn subjectFilter [list subject] (filter #(= (:subject %) subject) list))

(defn newStudent [names subjects]
  (let [
        name (rand-nth names)
        age (+ (rand-int 15) 10)
        grade (rand-int 10)
        subject (rand-nth subjects)]
    {:name name :age age :grade grade :subject subject}))

(defn newStudentsList [quant names subjects]
  (take quant (repeatedly #(newStudent names subjects))))


 (defn mesmoValorPropriedade? [lista aluno propriedade]
(filter #(= (propriedade %) (propriedade aluno)) lista))

 (defn valorDiferentePropriedade? [lista aluno propriedade]
(filter #(not (= (propriedade %) (propriedade aluno))) lista))

(defn buscaPorCriterio
  [funcao lista aluno propriedade]
   (funcao  lista aluno propriedade ))

;verificar se tem mesmo nome e mesma idade
(defn adicionaAluno [aluno lista]
  (if (or (empty (buscaPorCriterio mesmoValorPropriedade? lista aluno :name))
          (and (not-empty (buscaPorCriterio mesmoValorPropriedade? (buscaPorCriterio mesmoValorPropriedade?
                                                                                lista
                                                                                aluno :name) aluno :age))
          (empty (buscaPorCriterio mesmoValorPropriedade? (buscaPorCriterio mesmoValorPropriedade?
                                                                                (buscaPorCriterio mesmoValorPropriedade?
                                                                                lista
                                                                                aluno :name)
                                                                                aluno :age) aluno :subject)
          )))
    (conj lista aluno)
    )
  )

(def crialistaAlunosUnico
  (fn [quant nameList subjectList]
    (loop [
           list []]
      (if (= (= quant (count list)) (> (count nameList) (count list)))
        list
        (recur (adicionaAluno (newStudent nameList subjectList) list))
        ))))





(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello  World!")
  (println aluno1))
