export const Product = (props) => {

    return (<>
        <li className={`card mb-2`} key={props.id}>
            {props.imageUrl === "..." ? "" : <img className={`card-img`}
                                                  src={props.imageUrl}
                                                  alt={"picture of " + props.name}/>}
            <h3 className={`card-header`}>{props.name}</h3>
            <p className={`card-body text-left`}>{props.description}</p>
            <button className={`btn btn-primary m-2`}
                    name={"Add to Cart"}>${props.price} - Add to Cart
            </button>
        </li>
    </>)
}