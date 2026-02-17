const os=require('os');
console.log("system platform: "+os.platform());
console.log("system user:" ,os.userInfo());
console.log("system architecture: "+os.arch());
console.log("os memory:" +os.totalmem());
console.log("os free memory:" +os.freemem());
console.log("os uptime:" +os.uptime());