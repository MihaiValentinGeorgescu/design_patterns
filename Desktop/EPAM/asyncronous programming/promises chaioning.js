let a = 4;
function dosth() {
    return new Promise((resolve, reject) => {
        if( a % 2 == 0){
            a ++;
            resolve("a is not par anymore");
        }else{
            reject("a is impar");
        }
    });
}

function seconddosth(a) {
    return new Promise((resolve, reject) => {
        if( a % 2 != 0 ){
            resolve("very good");
        }else{
            reject("not good");
        }
    });
}

dosth()
    .then(result => {
        return new seconddosth(result);
    })
    .catch(err => {
        console.error("not good " + err);
    }) 
    .finally(() =>{
        console.log("its done");
    });