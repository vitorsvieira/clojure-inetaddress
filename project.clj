(defproject clojure-inetaddress "0.1.0-SNAPSHOT"
  :description "Clojure NetworkInterface. java.net.NetworkInterface class wrapper."
  :url "https://github.com/notvitor/clojure-inetaddress"
  :license {:name "The MIT License (MIT)"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :min-lein-version "2.0.0"
  :test-selectors {:default (fn [v] (not (:time-consuming v))),
                   :time-consuming (fn [v] (:time-consuming v)),
                   :focus (fn [v] (:focus v)),
                   :all (fn [_] true)}
  :warn-on-reflection false)
