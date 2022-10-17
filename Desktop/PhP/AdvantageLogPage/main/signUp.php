<?php
session_start();
require_once 'connect.php';


$login = $_POST['login'];
$email = $_POST['email'];
$password = $_POST['password'];
$confirmed_password = $_POST['confirmed_password'];

if($password === $confirmed_password)
{
    $password = md5($password);
    mysqli_query($connect,"INSERT INTO `users` (`id`, `login`, `email`, `password`) VALUES (NULL, '$login', '$email', '$password')");
    $_SESSION['message'] = 'Successful registration';
    header('Location: ../log.php');
}else
{
    $_SESSION['message'] = 'Passwords arent the same';
    header('Location: ../registration.php');
}