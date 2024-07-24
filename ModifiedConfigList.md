以下列出的配置的默认值被修改为了列出的值。

The default values for the configurations listed below have been modified to the values listed.
### paper-global.yml
```yaml
item-validation:
  resolve-selectors-in-books: true
commands:
  time-command-affects-all-worlds: true
misc:
  fix-entity-position-desync: false
packet-limiter:
  all-packets:
    interval: 1.0
    max-packet-rate: 114514.0
overrides: {}
unsupported-settings:
  allow-headless-pistons: true
  allow-permanent-block-break-exploits: true
  allow-piston-duplication: true
  allow-grindstone-overstacking: true
  allow-unsafe-end-portal-teleportation: true
  allow-tripwire-disarming-exploits: true
```
### paper-world-defaults.yml
```yaml
chunks:
  delay-chunk-unloads-by: 0s
  max-auto-save-chunks-per-tick: 200
collisions:
  allow-player-cramming-damage: true
  max-entity-collisions: 114514
entities:
  behavior:
    phantoms-do-not-spawn-on-creative-players: false
    phantoms-only-attack-insomniacs: false
  spawning:
    count-all-mobs-for-spawning: true
    per-player-mob-spawns: false
    duplicate-uuid:
      mode: warn
    filter-bad-tile-entity-nbt-from-falling-blocks: false
    filtered-entity-tag-nbt-paths: []
fixes:
  disable-unloaded-chunk-enderpearl-exploit: false
hopper:
  cooldown-when-full: false
maps:
  item-frame-cursor-limit: 10086
scoreboards:
  use-vanilla-world-scoreboard-name-coloring: true # 暂时无效 # Currently unavailable
unsupported-settings:
  fix-invulnerable-end-crystal-exploit: false
```
### spigot.yml
```yaml
world-settings:
  default:
    max-tnt-per-tick: 0
```