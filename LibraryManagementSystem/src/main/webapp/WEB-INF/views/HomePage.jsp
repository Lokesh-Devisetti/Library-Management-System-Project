<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" %>
    <!DOCTYPE html>
    <html>
    <head>
    <style>
    ul {
      list-style-type: none;
      margin: 0;
      padding: 0;
      overflow: hidden;
      background-color: #333;
    }
    
    li {
      float: left;
    }
    
    li a {
      display: block;
      color: white;
      text-align: center;
      padding: 14px 16px;
      text-decoration: none;
    }
    
    li a:hover:not(.active) {
      background-color: #111;
    }
    
    .active {
      background-color: #04AA6D;
    }
    footer {
  text-align: center;
  padding: 3px;
  background-color: DarkSalmon;
  color: white;
  margin-top: auto;
}
.centerImage
{
 text-align:center;
 display: block;
  margin-left: auto;
  margin-right: auto;
  width: 50%;
}
    </style>
    </head>
    <body>
    
    <ul>
        
      <li><a href="/ChildrenBooks">Children Books</a></li>
      <li><a href="/FictionBooks">Fiction Books</a></li>
      <li><a href="/NonFictionBooks">NonFiction Books</a></li>
      <li><a href="/YouthBooks">Youth Books</a></li>
      <li><a href="/logout">Logout</a></li>
    </ul>
    
    </body>
    </html>
    
    