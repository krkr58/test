for(var i=1;i<=10;i++){
    if(i%2==0){
        document.write(i);
    }
}

document.write("<br>");

for(var i=3;i<=8;i++){
    if(i>5){
        document.write(i);
        document.write("<br>");
    }
}

document.write("<br>");

for(var i=1;i<=9;i++){
    for(var a=1;a<=9;a++){
        document.write(i*a);
    }
    document.write("→"+i+"の段<br>");
}

document.write("<br>");

for(var i=1;i<=5;i++){
    for(var a=1;a<=9;a++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br>");

for(var i=1;i<=12;i++){
    document.write(i+"月:");
    for(var a=1;a<=30;a++){
        document.write(a+"日/");
    }
    document.write("<br><br>");
}

document.write("<br>");

for(var i=10;i>=0;i--){
   if(i==0){
       document.write("終了"+"<br>");
   }else{
        document.write(i+"<br>");
   }
}

document.write("<br>");

for(var i=0;i<5;i++){
    for(var a=0;a<=5;a++){
        if(a%2==0){
            document.write("★");
        }else{
            document.write("☆");
        }
    }
    document.write("<br>");
}

document.write("<br>");

for(var i=1;i<30;i++){
    if(i%2==0){
        document.write("2の倍数");
    }else if(i%3==0){
        document.write("3の倍数");
    }else{
      document.write(i);  
    }
    document.write("<br>");
}