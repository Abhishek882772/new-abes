import { useState } from "react";

function App() {
  const [data, setData] = useState("");

  const total = async () => {
    const res = await fetch("http://localhost:5000/total-memory");
    const result = await res.json();
    setData(result.data);
  };

  const freeMemory = async () => {
    const res = await fetch("http://localhost:5000/free-memory");
    const result = await res.json();
    setData(result.data);
  };

  const userInfo = async () => {
    const res = await fetch("http://localhost:5000/user-info");
    const result = await res.json();
    setData(JSON.stringify(result.data));
  };

  const cpuart = async () => {
    const res = await fetch("http://localhost:5000/cpu-arch");
    const result = await res.json();
    setData(result.data);
  };

  return (
    <div className="flex flex-col items-center justify-center h-screen gap-4">
      <div className="flex m-4 gap-4">
        <button onClick={total}>Total memory</button>
        <button onClick={freeMemory}>Free memory</button>
      </div>
      <div className="flex gap-4">
        <button onClick={userInfo}>User info</button>
        <button onClick={cpuart}>CPU architecture</button>
      </div>

      <h2 className="mt-4 text-lg font-bold">{data}</h2>
    </div>
  );
}

export default App;