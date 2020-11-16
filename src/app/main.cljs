(ns app.main
  (:require [reagent.dom :as rdom]))

(defn hello []
  [:div.flex.justify-center.p-24
   [:div.bg-gray-200.px-8.py-4
    [:p "Hello!"]
    [:p "Looks like everything is working."]]])

(defn mount []
  (rdom/render [hello] (js/document.getElementById "app")))

(defn ^:dev/after-load reload! []
  (mount))

(defn main! []
  (mount))
