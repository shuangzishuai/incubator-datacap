package io.edurt.datacap.plugin.example;

import io.edurt.datacap.spi.Plugin;
import io.edurt.datacap.spi.PluginType;
import io.edurt.datacap.spi.model.Configure;
import io.edurt.datacap.spi.model.Response;

public class ExamplePlugin
        implements Plugin
{
    @Override
    public String getName()
    {
        return null;
    }

    @Override
    public PluginType getType()
    {
        return null;
    }

    @Override
    public void connect(Configure configure)
    {
    }

    @Override
    public Response execute(String content)
    {
        return null;
    }

    @Override
    public void destroy()
    {
    }
}
