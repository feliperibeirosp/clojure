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

(def listaNomes (list "Felipe" "Mariana" "Carol" "Pablo" "Carlos"))

(def listaMaterias (list "Portugues" "Matematica" "Biologia" "Historia"))

(defn filtraMelhoresAlunos [lista] ( filter #(> (:nota %) 9) lista ))

(defn  criaAluno []
  (let [
        nome (rand-nth listaNomes)
        idade (+ (rand-int 15) 10)
        nota (rand-int 10)
        materia (rand-nth listaMaterias)]
    {:nome nome :idade idade  :materia materia :nota nota}))

(defn novaListaAlunos [quantidade]
      ( take quantidade (repeatedly #( conj []  (aluno))  )))


