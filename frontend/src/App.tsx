// import { useState } from 'react'
import './App.css'
import  {SearchBar} from './components/SearchBar/SearchBar'
import { Header } from './components/Header/Header'

// CURRENT DATA FROM .JSON IS JUST EXAMPLES! NOT REAL DATA TO BE USED IN PROD.

function App() {

  return (
    <>
      <section className="Header">
        <Header/>
        <SearchBar />
      </section>
    </>
  )
}

export default App
