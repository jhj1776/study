const url = "http://127.0.0.1/api/board/list";
fetch(url)
.then(resp => resp.json())
.then(data =>{
    console.log(data);
});