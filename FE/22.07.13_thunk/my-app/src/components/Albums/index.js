import { useEffect } from "react";
import { useDispatch, useSelector } from "react-redux";
import {getAlbumsByUserId, getPhotosByAlbumId} from '../../storage/actionsCreator'
import {Spinner} from '../../ui/Spinner'


function Albums (){
  const dispatch = useDispatch();

  const activeUser = useSelector(state => state.activeUser) ?? {} ;
  const albums = useSelector(state => state.albums);
  const isLoading = useSelector(state => state.isLoading);

  useEffect(
    ()=>{
      if (Object.keys(activeUser).length !== 0) {
        dispatch(getAlbumsByUserId(activeUser.id));
      }
    }, [activeUser]
  )
  
  function AlbumsList(){
    return (
      <div className={`list-group`}>
        {
          albums.map(album => <AlbumItem album={album} key={album.id} />)
        }
      </div>
    )
  }

  return (
    <>
      {
        isLoading ? <Spinner /> : <AlbumsList />
      }
    </>
  )
}

function AlbumItem({album}){
  const dispatch = useDispatch();
  const isPhotosLoading = useSelector(state => state.isPhotosLoading);

  console.log(isPhotosLoading);

  return (
    <>
      <p>{album.title}</p>
      {
        isPhotosLoading
        ? <Spinner />
        :(album.photos 
        ? <Photos album={album}/>
        : (
          <button
            onClick={() => dispatch(getPhotosByAlbumId(album.id))}
          >Get photos</button>
        ))
      }
    </>
  )
}

function Photos ({album}){
  return (
    album.photos.map((photo, index) => {
      if(index < 2){
        return <img key={photo.id} src={photo.url} alt={photo.title}/>
      }
      return undefined;
    })
  )  
}

export default Albums;