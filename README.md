#  Functional Programmming &  Regular_Expression

Lamda are just a function they are not belonging to the class 
eg: 
   bolckOfCode = public void greet(Arun object){
     object.perform();
   }
# lets turn into above code to lamdas
1) **remove public** : if the method is beloging to the class mean we can declare the scope but, in lamdas it belonging to the 
perticular varible.
2) **remove method name** : again the same the method is stick into the perticular varible.
3) **remove return type** : java becomes smart you don't neet to write it will detect automatically.
4) **add lamda ->**
# Then it become like this
bolckOfCode =(Arun object)->{ 
     object.perform(); 
   }
