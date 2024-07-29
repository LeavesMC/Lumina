## Removed features

### Carpet Profiler

Please use Spark.

Correspondingly, the 'commandProfile' and 'perfPermissionLevel' rules are also removed.

### Scarpet

Not currently supported, please use Skript or other similar plugins

Correspondingly, ` commandScript `, ` commandScriptACE `, ` scriptsAutoload `, ` scriptsAutoload `, `scriptsOptimization `
and `scriptsAppStore` rules is also removed.

## Removed rules

### language

~~Yes, I haven't written it yet~~

### carpetCommandPermissionLevel

Use permission nodes instead (which should point to the document, but I haven't written it yet)

### superSecretSetting

You won't need it

### optimizedTNT

The paper has been optimized

### tntRandomRange

The implementation of Carpet for this depends on `optimizedTNT`, ~~and I'm too lazy to write it~~

### fastRedstoneDust

The paper has been optimized

### lagFreeSpawning

The paper has been optimized

### commandTick

The built-in ones should be enough, right
I am not very familiar with this command. Could someone who is familiar with it please help to supplement it

### maxEntityCollisions

Please use `max identity collisions` in` paper-world-defaults.yml`
Configuration (The default value of this configuration has been modified, see [Modify List](./DefaultModifiedConfigList) for
details

### pingPlayerListLimit

~~It's just that I don't want to do it~~

If there's a need to raise an issue plz

### customMOTD

Go use the plugin

### viewDistance & simulationDistance

Are these two really meaningful? I'm not very familiar with this, could someone with knowledge help to supplement it

### cleanLogs

Please use the `settings.log-named-deaths` and `settings.log-villager-deaths` in `spigot.yml` to configure

### movableBlockEntities

~~I don't understand carpet's implementation of this~~ If you need it, please raise an issue

### structureBlockLimit && structureBlockIgnored && structureBlockOutlineDistance

I'm not sure how to implement this, TODO