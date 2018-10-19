package pl.jdata.statest.common.junit;

public interface TestStateRepository {


    /**
     * @throws TestStateObjectDoesNotExistException when object with given id does not exist in the repository.
     */
    <T> T load(String objectId, Class<T> clazz);

    void store(String objectId, Object object);

}
