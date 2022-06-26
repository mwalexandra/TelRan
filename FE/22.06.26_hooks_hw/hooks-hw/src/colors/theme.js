import { createContext } from "react"

const theme = {
  dark: {
    color: 'white',
    background:'black'
  },
  light: {
    color: 'black',
    background:'gray'
  },
};

const ThemeContext = createContext(theme.light);

export {theme, ThemeContext}