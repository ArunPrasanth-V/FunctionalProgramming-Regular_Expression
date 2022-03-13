#  Functional Programmming &  Regular_Expression

Lambda are just a function they are not belonging to the class 
# eg: <br>
   bolckOfCode = public void greet(Arun object){<br>
     object.perform();<br>
   }
# lets turn into above code to lamdas
1) **remove public** : if the method is beloging to the class mean we can declare the scope but, in lambdas it belonging to the 
perticular varible.
2) **remove method name** : again the same the method is stick into the perticular varible.
3) **remove return type** : java becomes smart you don't neet to write it will detect automatically.
4) **add lambda ->**
# Then it become like this
bolckOfCode =(Arun object)->{ 
     object.perform(); 
   }
