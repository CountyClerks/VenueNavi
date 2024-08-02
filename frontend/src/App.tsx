import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import RenderVenue from './components/renderVenue'

// CURRENT DATA FROM .JSON IS JUST EXAMPLES! NOT REAL DATA TO BE USED IN PROD.

function App() {
  const [count, setCount] = useState(0)
  return (
    <>
     <RenderVenue/>
    </>
  )
}

export default App
