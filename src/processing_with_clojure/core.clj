(ns processing-with-clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(+ 5 4)
(defn soma [x y] (+ x y))

(defn nome [] (println "Felipe Ribeiro"))

(def aluno1 {:name "Felipe" :age 27 :materia "matematica" :nota 10})
(def aluno2 {:name "Maria" :age 24 :materia "portugues" :nota 8})
(def aluno3 {:name "Joao" :age 18 :materia "matematica" :nota 4})

(def listaAlunos (list aluno1 aluno2 aluno3))


(def nameList (list "Bob" "Mary" "Charles" "Steve" "Jack"))

(def subjectList (list "Math" "English" "History" "Music"))

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

(defn fn-mesmoNome?
  [nome]
  (fn [item]
    (= nome (:name item))))

(defn buscaPorCriterio
  [nome lista]
  (first (filter (fn-mesmoNome? nome) lista)))

(defn adicionaAluno [aluno list]
  (
    let [
         name2 (:name aluno)
         ]
    (if (not (buscaPorCriterio name2 list))
      (conj list aluno)
      )))



(def crialistaAlunosUnico
  (fn [quant nameList subjectList]
    (loop [
           list []]
       (if (= (= quant (count list)) (> (count nameList) (count list)))
        list
        (recur  (adicionaAluno (newStudent nameList subjectList) list))
        ))))




(def aluno4 {:name "Mariana" :age 18 :materia "matematica" :nota 4})

