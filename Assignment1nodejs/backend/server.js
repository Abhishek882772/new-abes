import express from 'express';
import os from 'os';
const app=express();
const port=3000;

app.get('/totalmem',(req,res)=>{
    res.send("total memory: "+os.totalmem());
})
app.get('/freemem',(req,res)=>{
    res.send("free memory: "+os.freemem());
})
app.get('/userInfo',(req,res)=>{
    res.send("user info: "+os.userInfo());
})
app.get('/arch',(req,res)=>{
    res.send("cpu architecture: "+os.arch());
})