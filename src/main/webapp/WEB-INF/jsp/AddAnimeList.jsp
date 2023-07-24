<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> <% taglib prefix="form"
uri="http://www.sprigframework.org/tags/form" %> <% taglib prefix="c"
uri="http://www.java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<head>
  <meta charset="ISO-8859-1" />
  <title>Add Anime</title>

  <link
    rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
  />
  <script src="https://ajax.googleapis.com/ajax/libs/jquery.3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

  <body>
    <div class="container">
      <h1 class="p-3">Add an Anime</h1>
      <form:form action="/saveAnime" method="post" modelAttribute="anime">
        <div class="row">
          <div class="form-group col-md-12">
            <label class="col-md-3" for="name">Name</label>
            <div class="form-group col-md-6">
              <form:input
                type="text"
                path="name"
                id="name"
                class="form-control input-sm"
                required="required"
              />
            </div>
          </div>
        </div>

        <div class="row">
          <div class="form-group col-md-12">
            <label class="col-md-3" for="name">Year</label>
            <div class="form-group col-md-6">
              <form:input
                type="text"
                path="name"
                id="name"
                class="form-control input-sm"
                required="required"
              />
            </div>
          </div>
        </div>

        <div class="row p-2">
          <div class="col-md-2">
            <button type="submit" value="Register" class="btn btn-success">
              Save
            </button>
          </div>
        </div>
      </form:form>
    </div>
  </body>
</head>
