package a24836be132a40929cfeaf354a205f50;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * a24836be-132a-4092-9cfe-af354a205f50
 */
class EavExample
{
    private String       phoneNumber;
    private List<String> eav;

    @Test
    void main()
    {
        EAVRecord entity = new EAVRecord();
        entity.dataType = "String";
        entity.value = "904";
        entity.entity = "phoneNumber";
    }
}

class EAVRecord
{
    String entity;
    String dataType;
    Object value;
}