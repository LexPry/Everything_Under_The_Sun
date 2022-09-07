import { useEffect, useState } from "react";
import { Product } from "./Products";
import styles from "../App.module.css";

export const Home = () => {
    const [ products, setProducts ] = useState([
        {
            id: 0,
            name: "",
            price: "",
            description: "",
            imageUrl: "",
        }
    ]);

    useEffect(() => {
        // fetching products from databaseLoader initially
        fetch('api/products')
            .then(response => response.json())
            .then(p => {
                setProducts(p);
            })
            .catch(err => console.error(err));
    }, []);

    return (
        <main className={styles.products}>
            <div className={`text-center p-md-5`}>
                <h1 className={`text-bg-primary p-3 mw-100`}>Welcome!</h1>
            </div>
            <h1 className={`pb-2 text-center text-lg-center`}>Products</h1>
            <p className={`pb-4 text-center`}>Check out our fantastic selection!</p>
            <ul className={`list-unstyled container w-75`}>
                {products.map(product => <Product key={product.id}
                                                  name={product.name}
                                                  price={product.price}
                                                  description={product.description}
                                                  imageUrl={product.imageUrl}/>)}
            </ul>
        </main>
    )
}