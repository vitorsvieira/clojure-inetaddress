(ns clojure-inetaddress.core-test
  (:require [clojure.test :refer :all]
            [clojure-inetaddress.core :refer :all :reload-all :true])
   (:import (java.net InetAddress Inet4Address)))

(def this-host (localhost))
(def loopback (loopback-address))
(def git (by-name "github.com"))

(deftest inetaddress-test
 (is (true? (instance? (type (byte-array 10)) (address this-host))))
 (is (true? (instance? Inet4Address (by-address (address this-host)))))
 (is (true? (instance? InetAddress (by-address (address this-host)))))
 (is (true? (instance? String (canonical this-host))))
 (is (true? (instance? String (host-address this-host))))
 (is (true? (instance? String (host-name this-host)))))

(deftest inetaddress-test-flags-localhost
  (is (true? (instance? Boolean (any-wildcard-address? this-host))))
  (is (true? (instance? Boolean (link-local-address? this-host))))
  (is (true? (instance? Boolean (loopback-address? this-host))))
  (is (true? (instance? Boolean (multicast-global-scope? this-host))))
  (is (true? (instance? Boolean (multicast-link-scope? this-host))))
  (is (true? (instance? Boolean (multicast-node-scope? this-host))))
  (is (true? (instance? Boolean (multicast-org-scope? this-host))))
  (is (true? (instance? Boolean (multicast-site-scope? this-host))))
  (is (true? (instance? Boolean (multicast-address? this-host))))
  (is (true? (instance? Boolean (reachable? this-host 10))))
  (is (true? (instance? Boolean (site-local-address? this-host)))))

(deftest inetaddress-test-flags-loopback
  (is (true? (instance? Boolean (any-wildcard-address? loopback))))
  (is (true? (instance? Boolean (link-local-address? loopback))))
  (is (true? (instance? Boolean (loopback-address? loopback))))
  (is (true? (instance? Boolean (multicast-global-scope? loopback))))
  (is (true? (instance? Boolean (multicast-link-scope? loopback))))
  (is (true? (instance? Boolean (multicast-node-scope? loopback))))
  (is (true? (instance? Boolean (multicast-org-scope? loopback))))
  (is (true? (instance? Boolean (multicast-site-scope? loopback))))
  (is (true? (instance? Boolean (multicast-address? loopback))))
  (is (true? (instance? Boolean (reachable? loopback 10))))
  (is (true? (instance? Boolean (site-local-address? loopback)))))

(deftest inetaddress-test-flags-github
  (is (true? (instance? Boolean (any-wildcard-address? git))))
  (is (true? (instance? Boolean (link-local-address? git))))
  (is (true? (instance? Boolean (loopback-address? git))))
  (is (true? (instance? Boolean (multicast-global-scope? git))))
  (is (true? (instance? Boolean (multicast-link-scope? git))))
  (is (true? (instance? Boolean (multicast-node-scope? git))))
  (is (true? (instance? Boolean (multicast-org-scope? git))))
  (is (true? (instance? Boolean (multicast-site-scope? git))))
  (is (true? (instance? Boolean (multicast-address? git))))
  (is (true? (instance? Boolean (reachable? git 100))))
  (is (true? (instance? Boolean (site-local-address? git)))))
