const no = [3, 5, 7, 8, 1, 9, 0, 2, 4, 6];
for (let i = 1; i < no.length; i++) {
  for (let j = 0; j < no.length - 1; j++) {
    if (no[j] < no[i]) {
      const t = no[i];
      no[i] = no[j];
      no[j] = t;
    }
  }
}
console.log(no);
