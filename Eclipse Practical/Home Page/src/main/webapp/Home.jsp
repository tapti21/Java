<!DOCTYPE html>
<!-- Created By CodingNepal - www.codingnepalweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Heritage Website</title> 

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
    <style>
    @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');
*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Poppins',sans-serif;
}
::selection{
  color: #000;
  background: #fff;
}
nav{
  position: fixed;
  background: #1b1b1b;
  width: 100%;
  padding: 10px 0;
  z-index: 12;
}
nav .menu{
  max-width: 1250px;
  margin: auto;
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 0 20px;
}
.menu .logo a{
  text-decoration: none;
  color: #fff;
  font-size: 35px;
  font-weight: 600;
}
.menu ul{
  display: inline-flex;
}
.menu ul li{
  list-style: none;
  margin-left: 7px;
}
.menu ul li:first-child{
  margin-left: 0px;
}
.menu ul li a{
  text-decoration: none;
  color: #fff;
  font-size: 18px;
  font-weight: 500;
  padding: 8px 15px;
  border-radius: 5px;
  transition: all 0.3s ease;
}
.menu ul li a:hover{
  background: #fff;
  color: black;
}
.img{
  background: url('https://images.squarespace-cdn.com/content/v1/62fbf293c4912c5514ac3b2a/30bc4238-ed9e-491e-9381-025cb642c5b1/adam-wilson-ktDODr-3tvY-unsplash.jpg')no-repeat;
  width: 100%;
  height: 100vh;
  background-size: cover;
  background-position: center;
  position: relative;
}
.img::before{
  content: '';
  position: absolute;
  height: 100%;
  width: 100%;
  background: rgba(0, 0, 0, 0.4);
}
.center{
  position: absolute;
  top: 52%;
  left: 50%;
  transform: translate(-50%, -50%);
  width: 100%;
  padding: 0 20px;
  text-align: center;
}
.center .title{
  color: #fff;
  font-size: 55px;
  font-weight: 600;
}
.center .sub_title{
  color: #fff;
  font-size: 52px;
  font-weight: 600;
}
.center .btns{
  margin-top: 20px;
}
.center .btns button{
  height: 55px;
  width: 170px;
  border-radius: 5px;
  border: none;
  margin: 0 10px;
  border: 2px solid white;
  font-size: 20px;
  font-weight: 500;
  padding: 0 10px;
  cursor: pointer;
  outline: none;
  transition: all 0.3s ease;
}
.center .btns button:first-child{
  color: #fff;
  background: none;
}
.btns button:first-child:hover{
  background: white;
  color: black;
}
.center .btns button:last-child{
  background: white;
  color: black;
}



.center1 .btns1{
  margin-top: 20px;
  }
  .center1 .btns1 button{
  height: 55px;
  width: 170px;
  border-radius: 5px;
  border: none;
  margin: 0 10px;
  border: 2px solid black;
  font-size: 20px;
  font-weight: 500;
  padding: 0 10px;
  cursor: pointer;
  outline: none;
  transition: all 0.3s ease;
}

.center1{
  position: absolute;
  top: 110%;
  left: 50%;
  transform: translate(-50%, -50%);
  width: 100%;
  padding: 0 20px; 
 text-align: center;
 }
 
.btns1 button:first-child:hover{
  background: grey;
  color: black;
}
.center1 .btns1 button:last-child{
  background: grey;
  color: black;
}  
 
}
    </style>
   </head>
<body>
  <nav>
    <div class="menu">
      <div class="logo">
        <a href="#">Heritage</a>
      </div>
      <ul>
        <li><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Services</a></li>
        <li><a href="#">Contact</a></li>
        <li><a href="#">Feedback</a></li>
      </ul>
    </div>
  </nav>
  <div class="img"></div>
  <div class="center">
    <div class="title"></div>
    <div class="sub_title"></div>
    <div class="btns">
      <button>Learn More</button>
      <button>Subscribe</button>
    </div>
  </div>
   <div class = "center1">
  <div class="btns1">
      <button>Services</button>
    </div>
    
    </div>
    
    
    
    
            
    <style type="text/css">
*{
 margin: 0px;
 padding: 0px;
}
body{
 font-family: arial;
}
.main{

 margin: 9%;
}

.card{
     width: 10%;
     display: inline-block;
     box-shadow: 2px 2px 20px black;
     border-radius: 5px; 
     margin: 1%;
    }

.image img{
  width: 100%;
  border-top-right-radius: 5px;
  border-top-left-radius: 5px;
  

 
 }


h1{
  font-size: 20px;
   text-align: center;
 }

button{
  margin-top: 1px;
  margin-bottom: 8px;
  background-color: white;
  border: 1px solid black;
  border-radius: 5px;
  padding:1px;
  margin-left: 18px; 
}
button:hover{
  background-color: black;
  color: white;
  transition: .5s;
  cursor: pointer;
}

</style>
<body>

<div class="main">

 <!--cards -->

<div class="card">

<div class="image">
   <img src="https://media.istockphoto.com/id/1479317502/photo/aerial-view-of-sangam-prayagraj.jpg?s=612x612&w=is&k=20&c=3QRMPjGhlG00xIJWLW-wqtx0HT6k7sDnBkdLofVQdEQ=">
</div>
<div class="title">
 <h1>Allahabad</h1>
</div>
<button>Read More...</button>
</div>

<!--cards -->


<div class="card">

<div class="image">
   <img src="https://cdn.pixabay.com/photo/2018/01/09/03/49/the-natural-scenery-3070808_1280.jpg">
</div>
<div class="title">
 <h1>
Banaras</h1>
</div>
<button>Read More...</button>
</div>
<!--cards -->


<div class="card">

<div class="image">
   <img src="https://cdn.pixabay.com/photo/2018/01/09/03/49/the-natural-scenery-3070808_1280.jpg">
</div>
<div class="title">
 <h1>
Agra</h1>
</div>
<button>Read More...</button>
</div>
<!--cards -->


<div class="card">

<div class="image">
   <img src="https://cdn.pixabay.com/photo/2018/01/09/03/49/the-natural-scenery-3070808_1280.jpg">
</div>
<div class="title">
 <h1>
Kanpur</h1>
</div>
<button>Read More...</button>
</div>
<!--cards -->


<div class="card">

<div class="image">
   <img src="https://cdn.pixabay.com/photo/2018/01/09/03/49/the-natural-scenery-3070808_1280.jpg">
</div>
<div class="title">
 <h1>
Kanpur</h1>
</div>
<button>Read More...</button>
</div>
<!--cards -->


<div class="card">

<div class="image">
   <img src="https://cdn.pixabay.com/photo/2018/01/09/03/49/the-natural-scenery-3070808_1280.jpg">
</div>
<div class="title">
 <h1>
Kanpur</h1>
</div>
<button>Read More...</button>
</div>
<!--cards -->


<div class="card">

<div class="image">
   <img src="https://cdn.pixabay.com/photo/2018/01/09/03/49/the-natural-scenery-3070808_1280.jpg">
</div>
<div class="title">
 <h1>
Kanpur</h1>
</div>
<button>Read More...</button>
</div>
<!--cards -->

<div class="card">

<div class="image">
   <img src="https://cdn.pixabay.com/photo/2018/01/09/03/49/the-natural-scenery-3070808_1280.jpg">
</div>
<div class="title">
 <h1>
Kanpur</h1>
</div>
<button>Read More...</button>
</div>
<!--cards -->




<!-- <! <div class="des">
 <p>You can Add Desccription Here...</p>
<button>Read More...</button>
</div> -->
</div>
</div>
     
    
    
  
</body>
</html>