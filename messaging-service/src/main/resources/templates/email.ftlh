<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Spring Boot Email using FreeMarker</title>
</head>
<style>
.emailStyle{
    font-family:'Times New Roman';
    padding: 10px;
    background-color: antiquewhite;
}
</style>
<body>
    <div class="emailStyle">
        <h5>Dear, ${msg.emailSubject}<h5>
        <h5>Invoice No ${msg.message}</b>


    </div>

<br/>
<div> Have a nice day..!</div>
</body>
</html>