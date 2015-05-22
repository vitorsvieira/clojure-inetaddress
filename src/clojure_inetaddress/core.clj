(ns clojure-inetaddress.core
  (:import [java.net InetAddress]))

(defn address
  "Returns the raw IP address of this InetAddress object"
  ^bytes [^InetAddress addr]
  (.getAddress addr))

(defn allbyname
  "Given the name of a host, returns an array of its IP addresses,
  based on the configured name service on the system."
  [^String host]
  (InetAddress/getAllByName host))

(defn by-address
  "Returns an InetAddress object given the raw IP address or
  based on the provided host name and IP address."
  (^InetAddress [^bytes addr]
   (InetAddress/getByAddress addr))
  (^InetAddress [^String host ^bytes addr]
   (InetAddress/getByAddress host addr)))

(defn by-name
  "Determines the IP address of a host, given the host's name."
  [^String host]
  (InetAddress/getByName host))

(defn canonical
  "Gets the fully addr domain name for this IP address."
  ^String [^InetAddress addr]
  (.getCanonicalHostName addr))

(defn host-address
  "Returns the IP address string in textual presentation."
  ^String [^InetAddress addr]
  (.getHostAddress addr))

(defn host-name
  "Gets the host name for this IP address."
  ^String [^InetAddress addr]
  (.getHostName addr))

(defn localhost
  "Returns the address of the local host."
  ^InetAddress []
  (InetAddress/getLocalHost))

(defn loopback-address
  "Returns the loopback address."
  ^InetAddress []
  (InetAddress/getLoopbackAddress))

(defn any-wildcard-address?
  "Utility routine to check if the InetAddress in a wildcard address."
  ^Boolean [^InetAddress addr]
  (.isAnyLocalAddress addr))

(defn link-local-address?
  "Utility routine to check if the InetAddress is an link local address."
  ^Boolean [^InetAddress addr]
  (.isLinkLocalAddress addr))

(defn loopback-address?
  "Utility routine to check if the InetAddress is a loopback address."
  ^Boolean [^InetAddress addr]
  (.isLoopbackAddress addr))

(defn multicast-global-scope?
  "Utility routine to check if the multicast address has global scope."
  ^Boolean [^InetAddress addr]
  (.isMCGlobal addr))

(defn multicast-link-scope?
  "Utility routine to check if the multicast address has link scope."
  ^Boolean [^InetAddress addr]
  (.isMCLinkLocal addr))

(defn multicast-node-scope?
  "Utility routine to check if the multicast address has node scope."
  ^Boolean [^InetAddress addr]
  (.isMCNodeLocal addr))

(defn multicast-org-scope?
  "Utility routine to check if the multicast address has organization scope."
  ^Boolean [^InetAddress addr]
  (.isMCOrgLocal addr))

(defn multicast-site-scope?
  "Utility routine to check if the multicast address has site scope."
  ^Boolean [^InetAddress addr]
  (.isMCSiteLocal addr))

(defn multicast-address?
  "Utility routine to check if the InetAddress is an IP multicast address."
  ^Boolean [^InetAddress addr]
  (.isMulticastAddress addr))

(defn reachable?
  "Test whether that address is reachable."
  (^Boolean [^InetAddress addr ^Integer timeout]
   (.isReachable addr timeout))
  (^Boolean [^InetAddress addr ^java.net.NetworkInterface netif ^Integer ttl ^Integer timeout]
   (.isReachable addr netif ttl timeout)))

(defn site-local-address?
  "Utility routine to check if the InetAddress is a site local address."
  ^Boolean [^InetAddress addr]
  (.isSiteLocalAddress addr))
