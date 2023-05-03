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
      <li><a class="active" href="#home">Welcome to libararyManagement App</a></li>
      <li><a href="/loginForm">Login</a></li>
      
    </ul>
    <img src="https://media.istockphoto.com/id/1180993120/photo/bookshelves-in-the-library-with-old-books-3d-render.jpg?s=612x612&w=is&k=20&c=01YqFtTrMfv9IJNSrtdH4gIATokvryKp-HrVZfrJrEg=">
    <footer>
        <p>Author: Lokesh<br>
        All rights reserverd @2023</p>
      </footer>
    </body>
    </html>
    