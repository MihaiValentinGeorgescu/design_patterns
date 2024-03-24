// function promiseToResolve(){
//     return new Promise((resolve, reject) => {
//         setTimeout(() =>{
//             resolve("i a resolved");
//         }, 2000);
//     });
// }

// promiseToResolve().then((result) => {
//     console.log(result);
// });

// function promiseToReject(){
//     return new Promise((resolve, reject) => {
//         setTimeout(() =>{
//             reject("i a rejected");
//         }, 2000);
//     });
// }

// promiseToReject().catch((error) => {
//     console.log(error);
// });
let a = 5;
function trysth(){
    return new Promise((resolve, reject) => {
        if(a%2==0){
            resolve("Yay");
        }else{
            reject("Fuck");
        }
    });
}

trysth().then((result) => {
    console.log(result);
});

trysth().catch((error) => {
    console.log(error);
});

const promise = () => {
    return new Promise((resolve, reject) => {
        if(a%2==0){
            resolve("Yay");
        }else{
            reject("Fuck");
        }
    });
}

promise()
    .then((result) => {
        console.log(result);
    })
    .catch((error) => {
        console.error("Error " + error);
    })
    .finally(() => {
        console.log("its done");
    });
