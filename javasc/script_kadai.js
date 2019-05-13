document.write("<br><br>");

//1
for(var i=0;i<5;i++){
    document.write("★");
}

document.write("<br><br>");

//2
for(var i=0;i<2;i++){
    for(var j=0;j<3;j++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br><br>");

//3
for(var i=0;i<2;i++){
    for(var j=0;j<5;j++){
        document.write("☆");
    }
    document.write("<br>");
}

document.write("<br><br>");

//4
for(var i=0;i<4;i++){
    for(var j=0;j<5;j++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br><br>");

//5
for(var i=0;i<4;i++){
    for(var j=0;j<3;j++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br><br>");

//6
for(var i=0;i<3;i++){
    for(var j=0;j<3;j++){
         if(j==1){
            document.write("☆");
         }else{
              document.write("★");
         }
    }
    document.write("<br>");
}

document.write("<br><br>");

//7
for(var i=0;i<4;i++){
    for(var j=0;j<5;j++){
         if(j==1 || j==3){
            document.write("☆");
         }else{
              document.write("★");
         }
    }
    document.write("<br>");
}

document.write("<br><br>");

//8
for(var i=0;i<5;i++){
    for(var j=0;j<i+1;j++){
            document.write("★");
    }
    document.write("<br>");
}

document.write("<br><br>");

//1
function men(han){
    return han*han*3.14;
}
document.write("半径5cmの円の面積は"+men(5)+"<br>");
document.write("半径7cmの円の面積は"+men(7)+"<br>");
document.write("半径10cmの円の面積は"+men(10)+"<br>");

document.write("<br><br>");

//2
function goukei(otona,kodomo){
    return (otona*500)+(kodomo*200);
}
document.write(goukei(2,4)+"円です"+"<br>");
document.write(goukei(1,5)+"円です"+"<br>");
document.write(goukei(3,7)+"円です"+"<br>");

document.write("<br><br>");

//1
for(var i=0;i<5;i++){
    for(var j=0;j<5;j++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br><br>");

//2
for(var i=1;i<=25;i++){
    if(i%2==0){
        document.write("☆");
    }else{
        document.write("★");
    }
    if(i%5==0){
        document.write("<br>");
    }
}