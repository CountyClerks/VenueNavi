// import { useState } from 'react'
import './App.css'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import { Home } from './pages/home'
import { Search } from './pages/search'

// CURRENT DATA FROM .JSON IS JUST EXAMPLES! NOT REAL DATA TO BE USED IN PROD.

function App() {

  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home/>}/>
          <Route path="/search" element={<Search/>}/>
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
