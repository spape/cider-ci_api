; Copyright (C) 2013, 2014, 2015 Dr. Thomas Schank  (DrTom@schank.ch, Thomas.Schank@algocon.ch)
; Licensed under the terms of the GNU Affero General Public License v3.
; See the "LICENSE.txt" file provided with this software.

(defproject cider-ci_api "2.2.0"
  :description "Cider-CI API"
  :url "https://github.com/cider-ci/cider-ci_api"
  :license {:name "GNU AFFERO GENERAL PUBLIC LICENSE Version 3"
            :url "http://www.gnu.org/licenses/agpl-3.0.html"}
  :dependencies [
                 [cheshire "5.4.0"]
                 [cider-ci/clj-auth "2.1.0"]
                 [cider-ci/clj-utils "2.4.0"]
                 [org.clojure/tools.nrepl "0.2.7"]
                 [org.jruby/jruby-complete "9.0.0.0.pre1"]
                 [ring-middleware-accept "2.0.3"]
                 [ring/ring-core "1.3.2"]
                 [honeysql "0.4.3"]
                 ]
  :source-paths [ "json-roa/src" 
                  "src" ]
  :test-paths ["test"
               "json-roa/test"]
  :profiles {
             :dev { :resource-paths ["resources_dev"] }
             :production { :resource-paths [ "/etc/cider-ci_api-v2" ] }}
  :aot [cider-ci.api.main] 
  :main cider-ci.api.main 
  :repositories [["tmp" {:url "http://maven-repo-tmp.drtom.ch" :snapshots false}]]
  :jvm-opts ["-Xmx256m"]
  )

;(cemerick.pomegranate.aether/register-wagon-factory!  "scp" #(let [c (resolve 'org.apache.maven.wagon.providers.ssh.external.ScpExternalWagon)] (clojure.lang.Reflector/invokeConstructor c (into-array []))))

