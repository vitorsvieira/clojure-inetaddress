clojure-inetaddress
--------------

[![Build Status](https://travis-ci.org/notvitor/clojure-inetaddress.svg?branch=master)](https://travis-ci.org/notvitor/clojure-inetaddress)

Clojure InetAddress. java.net.InetAddress class wrapper.


## Usage

Get IP address of a host, given the host's name:

    => (by-name "github.com")
    #<Inet4Address github.com/192.30.252.129>

Get the address of the local host:

    => (localhost)
    #<Inet4Address my-laptop-01/10.121.90.2>

Check if address address is reachable:

    => (reachable? (by-name "server-in-my-lan") 1000)
    true


For more examples and full documentation check the link below.
- [http://docs.oracle.com/javase/8/docs/api/java/net/InetAddress.html](http://docs.oracle.com/javase/8/docs/api/java/net/InetAddress.html).


---

Have a request, suggestion or question?

Drop me an email: vitorsvieira at yahoo.com

You can also find me at [@notvitor](https://twitter.com/notvitor)


---

### License

The MIT License (MIT)

Copyright (c) 2015 Vitor Vieira

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
