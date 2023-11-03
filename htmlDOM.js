const div = document.getElementById("numbs");

function sort() {
  let n = document.getElementById("input").value;
  let val = n.split(" ");
  // console.log(val);
  let len = val.length;
  for (i = 0; i < len; i++) {
    // let n1 = val[i];
    for (j = i + 1; j < len; j++) {
      if (val[i] > val[j]) {
        let temp = val[i];
        val[i] = val[j];
        val[j] = temp;
      }
    }
  }
  let s=0;
  let x = setInterval(function () {
    const itm = document.createTextNode(`${val[s]}`);
    s = s + 1;
    div.appendChild(itm);
    if(s==len){
      clearInterval(x);
    }
  }, 1000);
  console.log(val);
}
