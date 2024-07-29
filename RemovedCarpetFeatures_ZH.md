## 移除的功能

### Carpet Profiler

请使用 Spark。

相应的，`commandProfile`与`perfPermissionLevel`规则也被移除。

### Scarpet

暂不支持，请使用 Skript 或其他类似的插件

相应的，`commandScript`, `commandScriptACE`, `scriptsAutoload`, `scriptsAutoload`, `scriptsOptimization`
与`scriptsAppStore`规则也被移除。

## 移除的规则

### language

~~是的我还没写~~

### carpetCommandPermissionLevel

使用权限节点以代替（这里应当指向文档，但我还没写）

### superSecretSetting

你用不到的

### optimizedTNT

Paper 已经优化了

### fastRedstoneDust

Paper 已经优化了

### lagFreeSpawning

Paper 已经优化了

### commandTick

内置的应该够了吧（x

我不是很了解这个命令，麻烦有了解的人帮忙补充一下

### maxEntityCollisions

请使用 `paper-world-defaults.yml` 中的 `max-entity-collisions`
配置（此配置的默认值已经被修改，详见[Modify List](./DefaultModifiedConfigList)）

### pingPlayerListLimit

~~单纯是我不想做~~ 有需要提issue吧

### customMOTD

去用插件

### viewDistance && simulationDistance

这两个真的有意义吗？我不是很了解这个，麻烦有了解的人帮忙补充一下

### cleanLogs

请使用 `spigot.yml` 中的 `settings.log-named-deaths`与`settings.log-villager-deaths`配置

### movableBlockEntities

~~这个我不会~~ 有需要提issue吧

### structureBlockLimit && structureBlockIgnored && structureBlockOutlineDistance

不是很确定该怎么实现，TODO