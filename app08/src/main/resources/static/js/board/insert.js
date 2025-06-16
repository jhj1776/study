console.log("아무거나");
function f01(){
    console.log("f01 called...");
    
    const title = document.querySelector("#a").value;
    const content = document.querySelector("#b").value;
    //POST 
    const url = "http://127.0.0.1/api/board/insert";
    const vo = {
        title,
        content,
    };
    const option = {
        method: "POST",
        headers : {
            "Content-Type" : "application/json"
        }, 
        body : JSON.stringify(vo),
    };
    fetch(url,option)
    .then(resp=>resp.text())
    .then(data=> {
        if(data == 1 ){
            location.href = "http://127.0.0.1/api/board/list";
        }else{
            alert("작성 실패");
        }
    })
}
