const div = document.getElementById("numbs");

let working = new Boolean(false);

function sort() {
    // first check if the div element is empty or not
    // if not then it will overrite the current text
    // so we need to clear it first
    if (document.getElementById("input").value.trim() === "") {
        console.log("empty?");
        alert("Enter numbers");
        return;
    }

    let tim = document.getElementById("sec").value;
    tim = parseInt(tim);

    if (div.innerHTML !== "") {
        div.innerHTML = "";
    }
    let n = document.getElementById("input").value;
    let val = n.split(" ");
    let len = val.length;

    // string to int conversion
    for (i = 0; i < len; i++) {
        val[i] = parseInt(val[i]);
    }

    // let val1 = document.createElement('span');
    // for(i = 0; i < len; i++){
    //    val1.innerHTML = val[i].toString();
    //    val[i] = val1;
    //    console.log(val[i].innerHTML);
    // }
    // console.log(val);
    let a = 0;
    let b = 1;
    if (working == true) {
        working = false;
        clearInterval(interval);
    }

    let interval = setInterval(() => {
        if (div.innerHTML !== "") {
            div.innerHTML = "";
        }
        if (working == false) {
            working = true;
        }
        // swap
        if (val[a] > val[b]) {
            let temp = val[a];
            val[a] = val[b];
            val[b] = temp;
        }
        // increment variables
        // console.log(a, b, val);
        if (b == len - 1) {
            a += 1;
            b = a + 1;
            console.log("limit");
            if (a == len - 1) {
                clearInterval(interval);
            }
        }
        else {
            b += 1;
        }
        // console.log(val[b]);
        div.innerHTML = val;

        // const sp = document.createElement("span");
        // sp.innerHTML = val[b].innerHTML;
        // sp.style.color = "pink";
        // div.appendChild(sp);
        

        // div.innerHTML = val.toString();
        // let str = `<span>${val[b].toString()}</span>`;
        // let regex = new RegExp(str);
        // console.log(str);
        // const nd = document.createElement('div').value = val[b].toString();
        // div.innerHTML = val.toString().match(regex);
        // document.createElement('span').innerHTML = nd;
        // console.log(sp.innerHTML.match(regex));
        // div.innerHTML = sp.innerHTML;
    }, tim);
}